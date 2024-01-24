package study.course.course.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import study.course.course.Entitiy.Course;

@Component
public interface CourseServise {
    public List<Course> getCourses();
    public Course getSingleCourse(long courseId);
    public Course deleteCourse(long long1);
    public Course addCourse(Course entity);
    public Course updateCourses(Course entity);

   
}
