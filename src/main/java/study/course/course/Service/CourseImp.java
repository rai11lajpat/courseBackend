package study.course.course.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import study.course.course.Dao_repositories.CourseRepositories;
import study.course.course.Entitiy.Course;

@Component
public class CourseImp implements CourseServise {

    @Autowired
    private CourseRepositories courseRepositories;
    
    // List<Course> list;
    // public CourseImp(){
    //     list=new ArrayList<>();
    //     list.add(new Course((long) 1,"c","basic"));
    //     list.add(new Course((long) 2,"python","basic"));
    //     list.add(new Course((long) 3,"java","basic"));
   
    // }

    @Override
    public List<Course> getCourses() {
        List<Course> list=(List<Course>) this.courseRepositories.findAll();
        return list;
    }

    @Override
    public Course getSingleCourse(long courseId) {
        Course c=null;
        // for(Course course:list){
        //     if(course.getId()==courseId){
        //         c=course;
        //         break;
        //     }
        // }
        try {
            c=this.courseRepositories.findById(courseId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return c;
    }

   
    @Override
    public Course addCourse(Course entity) {
        Course c=this.courseRepositories.save(entity);
        return c;
    }
    
    @Override
    public Course deleteCourse(long long1) {
        Course c=null;
        long a=long1;
        // for(Course course:list){
        //     if(a==course.getId()){
        //         c=course;
        //         list.remove(course);
        //         break;
        //     }
        // }
        c=this.courseRepositories.findById(long1);
        this.courseRepositories.deleteById(long1);
        return c;
    }

    @Override
    public Course updateCourses(Course entity) {
        long id=entity.getId();
        // for(Course course:list){
        //     if(course.getId()==id){
        //         course.setTitle(c.getTitle());
        //         course.setDiscription(c.getDiscription());
        //     }
        // }
        Course newCourse=this.courseRepositories.findById(id);
        newCourse.setTitle(entity.getTitle());
        newCourse.setDiscription(entity.getDiscription());
        this.courseRepositories.save(newCourse);
        return newCourse;
    }
}
