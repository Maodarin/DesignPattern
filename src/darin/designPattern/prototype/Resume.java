package darin.designPattern.prototype;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private int age;
	private WorkExperience workExperience;

	
	public Resume(String name) {
		this.name = name;
		this.workExperience = new WorkExperience();
	}
	private Resume(WorkExperience work) {
		this.workExperience = (WorkExperience)work.Clone();
	}
	
	public void setPersonInfo(String sex,int age) {
		this.sex =sex;
		this.age = age;
	}
	
	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String timeArea,String company) {
		
		this.workExperience.setTimeArea(timeArea);
		this.workExperience.setCompany(company);
	}
	
	public void Display() {
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作经历"+workExperience.getTimeArea()+" "+workExperience.getCompany());
	}

	public Object Clone() {
		Resume obj = new Resume(this.workExperience);
		obj.name=this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	

}
