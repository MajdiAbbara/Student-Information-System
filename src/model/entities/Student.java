package model.entities;

import model.enums.Gender;
import model.enums.StudentStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class Student {
	private String id;
	private String studentNo;
	private String nationalId;
	private String firstName;
	private String lastName;
	private String birthDate;
	private Gender gender;
	private String email;
	private String phone;
	private String address;
	private String programId;
	private int enrollmentYear;
	private int classYear;
	private StudentStatus status;
	private String photoUrl;
	private LocalDateTime createdAt;
	


	Student(String studentNo, String nationalId, String firstName, String lastName,
            String birthDate, Gender gender, String email, String phone,
            String address, String programId, int enrollmentYear, int classYear, String photoUrl){
		
	this.id = UUID.randomUUID().toString();
	this.studentNo = studentNo;
	this.nationalId = nationalId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.gender = gender;
	this.email = email;
	this.phone = phone;
	this.address = address;
	this.programId = programId;
	this.enrollmentYear = enrollmentYear;
	this.classYear = classYear;
	this.status = StudentStatus.ACTIVE;
	this.photoUrl = photoUrl;
	this.createdAt = LocalDateTime.now();
}

public String getId() {return id;}
public void setId (String id) { this.id = id; }

public String getStudentNo() { return studentNo ;}
public void setStudentNo(String studentNo) {this.studentNo = studentNo;}

public String getNationalId() {return nationalId ;}
public void setNationalId(String nationalId) {this.nationalId = nationalId;}

public String getFirstName() {return firstName;}
public void setFirstName(String firstName) {this.firstName = firstName;}

public String getLastName () {return lastName ;}
public void setLastName(String lastName) {this.lastName = lastName;}

public String getBirthDate(){return birthDate;}
public void setBirthDate(String birthDate) {this.birthDate = birthDate;}

public Gender getGender() {return gender;}
public void setGender(Gender gender) {this.gender = gender;}

public String getEmail() {return email;}
public void setEmail(String email) {this.email = email;}

public String getPhone() {return phone;}
public void setPhone(String phone ) {this.phone = phone;}

public String getAddress() {return address;}
public void setAddress(String address) {this.address = address;}

public String getProgramId() {return programId;}
public void setProgramId(String programId) {this.programId = programId;}

public int getEnrollmentYear() {return enrollmentYear;}
public void setEnrollmentYear(int enrollmentYear) {this.enrollmentYear = enrollmentYear;}

public int getClassYear() {return classYear;}
public  void setClassYear(int classYear) {this.classYear = classYear;}

public StudentStatus getStatus() {return status;}
public void setStatus(StudentStatus status) {this.status = status;}

public String getPhotoUrl() {return photoUrl;}
public void setPhotoUrl(String photoUrl) {this.photoUrl = photoUrl;}

public LocalDateTime getCreatedAt() {return createdAt;}
public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

@Override
public String toString(){
	return "Student{" +
            "studentNo='" + studentNo + '\'' +
            ", fullName='" + firstName + " " + lastName + '\'' +
            ", classYear=" + classYear +
            ", status=" + status +
            '}';
}
}
 






		
