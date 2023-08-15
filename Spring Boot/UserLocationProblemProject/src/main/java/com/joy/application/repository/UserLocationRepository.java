package com.joy.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joy.application.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {}