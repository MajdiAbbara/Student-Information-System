package model.entities;

import model.enums.CourseType;

import java.util.UUID;

public class Course {
	private String id;
	private String code;
	private String name;
	private String departmentId;
	private int credits;
	private int theoryHours;
	private int labHours;
	private CourseType courseType;
	private String language;
	private String description;
	private boolean isActive;
	public Course (String code, String name, String departmentId, int credits, int theoryHours, int labHours,
			CourseType courseType, String language, String description) {
		
		this.id = UUID.randomUUID().toString();
		this.code = code;
		this.name = name;
		this.departmentId = departmentId;
		this.credits = credits;
		this.theoryHours = theoryHours;
		this.labHours = labHours;
		this.courseType = courseType;
		this.language = language;
		this.description = description;
		this.isActive = true;
		
	}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public int getTheoryHours() { return theoryHours; }
    public void setTheoryHours(int theoryHours) { this.theoryHours = theoryHours; }

    public int getLabHours() { return labHours; }
    public void setLabHours(int labHours) { this.labHours = labHours; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    // 3. toString
    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", courseType=" + courseType +
                ", credits=" + credits +
                '}';
    }
	

}
