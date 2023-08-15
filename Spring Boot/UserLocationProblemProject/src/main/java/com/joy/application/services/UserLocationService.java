package com.joy.application.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joy.application.model.UserLocation;
import com.joy.application.repository.UserLocationRepository;

@Service
public class UserLocationService {
	@Autowired
	private UserLocationRepository userLocationRepository;
	
	public UserLocation createUserLocation(UserLocation userLocation) 
	{
        return userLocationRepository.save(userLocation);
    }

    public UserLocation updateUserLocation(Long id, UserLocation updatedUserLocation) 
    {
        UserLocation userLocation = userLocationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User location not found"));
        
        userLocation.setName(updatedUserLocation.getName());
        userLocation.setLatitude(updatedUserLocation.getLatitude());
        userLocation.setLongitude(updatedUserLocation.getLongitude());
        userLocation.setExcluded(updatedUserLocation.isExcluded());

        return userLocationRepository.save(userLocation);
    }

    public List<UserLocation> getNearestUsers(int n) {
        List<UserLocation> allUserLocations = userLocationRepository.findAll();
        List<UserLocation> nonExcludedUsers = allUserLocations.stream()
        		.filter(userLocation -> !userLocation.isExcluded())
        		.collect(Collectors.toList());

        // Sort the non-excluded users by distance to (0,0)
        List<UserLocation> nearestUsers = nonExcludedUsers.stream()
                .sorted(Comparator.comparingDouble(this::calculateDistanceToOrigin))
                .limit(n)
                .collect(Collectors.toList());

        return nearestUsers;
    }
    
    // Haversine formula for distance calculation.
    private double calculateDistanceToOrigin(UserLocation userLocation) {
        double earthRadius = 6371;

        double lat1 = 0; // Latitude of origin (0,0)
        double lon1 = 0; // Longitude of origin (0,0)

        double lat2 = userLocation.getLatitude();
        double lon2 = userLocation.getLongitude();

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }
}
