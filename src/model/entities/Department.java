package model.entities;

import java.util.UUID;

public class Department {
    private String id;
    private String code;
    private String name;
    private String facultyId;
    private String headInstructorId;
    private String phone;
    private String email;
    private boolean isActive;

   
    public Department(String code, String name, String facultyId, String phone, String email) {
        this.id = UUID.randomUUID().toString();
        this.code = code;
        this.name = name;
        this.facultyId = facultyId;
        this.phone = phone;
        this.email = email;
        this.isActive = true;
    }

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFacultyId() { return facultyId; }
    public void setFacultyId(String facultyId) { this.facultyId = facultyId; }

    public String getHeadInstructorId() { return headInstructorId; }
    public void setHeadInstructorId(String headInstructorId) { this.headInstructorId = headInstructorId; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

 
    @Override
    public String toString() {
        return "Department{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}