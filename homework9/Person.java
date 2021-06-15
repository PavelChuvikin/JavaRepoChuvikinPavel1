import java.util.ArrayList;
import java.util.List;

public class Person implements Student {

    String name;

    List<Course> allCourses = new ArrayList<>();

     Person(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getNameApprop(List<Course> allCourses) {
        return name;
    }

    @Override
    public List<Course> getAllCourses(){
        return allCourses;
    }

    void addCourse(Course сourse){
        allCourses.add(сourse);
    }

    @Override
    public String toString() {
        return name;
    }
}
