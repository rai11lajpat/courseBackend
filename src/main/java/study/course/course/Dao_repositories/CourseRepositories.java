package study.course.course.Dao_repositories;

import org.springframework.data.repository.CrudRepository;

import study.course.course.Entitiy.Course;



public interface CourseRepositories extends CrudRepository<Course,Long> {
    public Course findById(long id);
}
