package study.course.course.Entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "course_id")
    private Long id;
    private String title;
    private String discription;
    
    public Course(Long i, String title, String discription) {

        
        this.id = i;
        this.title = title;
        this.discription = discription;
    }
    public Course() {
    }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
    }
  

    

}
