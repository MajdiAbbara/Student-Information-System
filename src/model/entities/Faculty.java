package model.entities;
import java.time.LocalDateTime;
import java.util.UUID;
public class Faculty {
	private String id;
	private String code;
	private String name;
	private String deanId;
	private String phone;
	private String email;
	private boolean isActive;
	private LocalDateTime createdAt;
	
	public Faculty(String code, String name,String phone, String email, String string) {
		this.id  = UUID.randomUUID().toString();
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.isActive = true;
		this.createdAt = LocalDateTime.now();
	}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDeanId() { return deanId; }
    public void setDeanId(String deanId) { this.deanId = deanId; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
    @Override
    public String toString () {
    	return"Faculty{" +
              "code='" +code+ '\'' +
              ", name='" + name + '\'' +
              ", email='" + email + '\'' +
              ", isActive='" + isActive +
              ", createdAt='" + createdAt +
              '}';
    }
	

}
