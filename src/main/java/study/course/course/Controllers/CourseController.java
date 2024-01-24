package study.course.course.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import study.course.course.Entitiy.Course;
import study.course.course.Service.CourseServise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class CourseController {
    
    @Autowired
    private CourseServise courseServise;

    @GetMapping("/courses")
    public List<Course> getCourses(){


        return this.courseServise.getCourses();
        
    }
    @GetMapping("/courses/{courseId}")
    public Course getSingleCourse(@PathVariable String courseId){

        return this.courseServise.getSingleCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course entity) {
        return this.courseServise.addCourse(entity);
    }

    @DeleteMapping("/courses/{id}")
    public Course deleteCourse(@PathVariable String id){
        return this.courseServise.deleteCourse(Long.parseLong(id));
    }

    @PutMapping("/courses")
    public Course putMethodName(@RequestBody Course entity) {
        //TODO: process PUT request
        
        return this.courseServise.updateCourses(entity);
    }
    
    
}
