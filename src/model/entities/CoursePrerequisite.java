package model.entities;

import model.enums.PrerequisiteType;

import java.util.UUID;

public class CoursePrerequisite {
    private String id;
    private String courseId;
    private String prerequisiteCourseId;
    private PrerequisiteType type;
    private String minGrade;

    public CoursePrerequisite(String courseId, String prerequisiteCourseId, 
                              PrerequisiteType type, String minGrade) {
        this.id = UUID.randomUUID().toString();
        this.courseId = courseId;
        this.prerequisiteCourseId = prerequisiteCourseId;
        this.type = type;
        this.minGrade = minGrade;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getPrerequisiteCourseId() { return prerequisiteCourseId; }
    public void setPrerequisiteCourseId(String prerequisiteCourseId) { this.prerequisiteCourseId = prerequisiteCourseId; }

    public PrerequisiteType getType() { return type; }
    public void setType(PrerequisiteType type) { this.type = type; }

    public String getMinGrade() { return minGrade; }
    public void setMinGrade(String minGrade) { this.minGrade = minGrade; }
    
    @Override
    public String toString() {
        return "CoursePrerequisite{" +
                "courseId='" + courseId + '\'' +
                ", prerequisiteCourseId='" + prerequisiteCourseId + '\'' +
                ", type=" + type +
                ", minGrade='" + minGrade + '\'' +
                '}';
    }
}