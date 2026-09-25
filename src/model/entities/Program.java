package model.entities;
import model.enums.DegreeLevel;
import java.util.UUID;

public class Program {
	private String id;
	private String code;
	private String name;
	private String departmentId;
	private DegreeLevel degreeLevel;
	private int totalCredits;
	private int durationYears;
	private String  language;
	private boolean isActive;
	
	public Program(String code, String name, String departmentId,
			DegreeLevel degreeLevel, int totalCredits, int durationYears, String language) {
		this.id = UUID.randomUUID().toString();
		this.code = code;
		this.name = name;
		this.departmentId = departmentId;
		this.degreeLevel = degreeLevel;
		this.totalCredits = totalCredits;
		this.durationYears = durationYears;
		this.language = language;
		this.isActive = true;
		
	}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getDepartmentId() {return departmentId;}
	public void setDepartmentId(String departmentId) {this.departmentId = departmentId;}
	
	public DegreeLevel getDegreeLevel() {return degreeLevel;}
	public void setDegreeLevel(DegreeLevel degreeLevel) {this.degreeLevel = degreeLevel;}
	
	public int getTotalCredits() {return totalCredits;}
	public void setTotalCredits(int totalCredits) {this.totalCredits = totalCredits;}
	
	public int getDurationYears(){return durationYears;}
	public void setDurationYears(int durationYears) {this.durationYears = durationYears;}
	
	public String getLanguage() {return language;}
	public void setLanguage(String language) {this.language = language;}
	
	public boolean getIsActive(){return isActive;}
	public void setActive (boolean isActive) {this.isActive = isActive;}
	
	@Override
    public String toString() {
        return "Program{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", degreeLevel=" + degreeLevel +
                ", durationYears=" + durationYears +
                ", language='" + language + '\'' +
                '}';
    
	}
	

}
