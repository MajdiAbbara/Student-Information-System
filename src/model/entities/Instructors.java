package model.entities;

import java.time.LocalDate;
import java.util.UUID;

public class Instructors {
    private String id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String departmentId;
    private String title;
    private String specialization;
    private LocalDate hireDate;
    private boolean isActive;

    
    public Instructors(String employeeNo, String nationalId, String firstName, String lastName,
                      String email, String phone, String departmentId, String title,
                      String specialization, LocalDate hireDate) {
        this.id = UUID.randomUUID().toString();
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.departmentId = departmentId;
        this.title = title;
        this.specialization = specialization;
        this.hireDate = hireDate;
        this.isActive = true; // المدرس يكون على رأس عمله تلقائياً عند تعيينه
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEmployeeNo() { return employeeNo; }
    public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    @Override
    public String toString() {
        return "Instructor{" +
                "employeeNo='" + employeeNo + '\'' +
                ", fullName='" + title + " " + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}