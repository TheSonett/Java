
public class College {
	private String collegeName;
	
	public College() {}
	
	public College(String collegeName) {
		System.out.println("College constructor called!!");
		
		this.setCollegeName(collegeName);
	}
	
	
	// getters and setters
	public String getCollegeName() { return this.collegeName; }	
	private void setCollegeName(String collegeName) { this.collegeName = collegeName; }
}
