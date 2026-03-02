import java.lang.Cloneable;

public class course implements Cloneable {
    private String courseName;
    private String courseCode;

    course(){
        this.courseName = "anonymous";
        this.courseCode = "anonymous";
    }
    course(String courseName , String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    course(course other){
        this.courseName = other.courseName;
        this.courseCode = other.courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public void set(String name , String code){
        this.courseName = name;
        this.courseCode = code;
    }

    public String toString(){
        return "CourseName: "+courseName+" , CourseCode: "+courseCode;
    }

    // Shallow copy bc of arraylist
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}