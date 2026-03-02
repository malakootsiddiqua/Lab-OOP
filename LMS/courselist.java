import java.util.ArrayList;
import java.util.List;
import java.lang.Cloneable;

public class courselist  implements Cloneable{
    private List<Course> courses = new ArrayList<Course>(100);

    courselist(){
        this.courses = new ArrayList<>();
    }
    courselist(ArrayList<Course> courses){
        this.courses = courses;
    }
    courselist(courselist other){
        this.courses = new ArrayList<>();
        for(Course c: other.courses){
            this.courses.add(new Course(c)); // uses copy constructor
        }
    }// add course to the list
    public boolean addCourse(Course course){
        if(courses.contains(course)) return false;
        else {
            courses.add(course);
        }
        return true;
    }// remove course from the list
    public boolean removeCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
            return true; // removed
        }
        else{
            return false;  //nothing to remove
        }
    }// Shallow copy bc of arraylist
    public Object clone() throws CloneNotSupportedException{
        CourseList copy = (CourseList) super.clone();
        copy.courses = new ArrayList<>();
        for(Course c : this.courses){
            copy.courses.add((Course) c.clone());
        }
        return copy;
    }
    public List<Course> getCourses(){
        return courses;
    }
    @Override
    public String toString(){
        return "Courselist: "+courses.toString();
    }
}