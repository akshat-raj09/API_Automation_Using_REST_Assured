package model;

public class PutPOJO {

	private String name;
	private String job;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public PutPOJO(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "CreatePostPOJO [name=" + name + ", job=" + job + "]";
	}

	
}