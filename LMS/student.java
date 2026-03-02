import java.util.ArrayList;
import java.util.List;

public class student implements Cloneable {
    private String name;
    private int seatNo;
    private List<Course> courses = new ArrayList<>(50);

    // null constructor
    student(){
        this.name = "anonymous";
        this.seatNo = 0;
        this.courses = new ArrayList<>();
    }
    // Parameterized 
    student(String name , int seatNo){
        this.name = name;
        this.seatNo = seatNo;
        this.courses = new ArrayList<>();
    }
    // Copy Const of student
    student(student other){
        this.name = other.name;
        this.seatNo = other.seatNo;
        this.courses = new ArrayList<>();
        for(Course c : other.courses){
            this.courses.add(new Course(c));
        }
    }//
    // Methods to add and remove courses from the studen
    public boolean addCourse(Course c){
        if(courses.contains(c)) return false;
        else {
            courses.add(c);
            return true;
        }
    }
    public boolean removeCourse(Course c) {
        if (courses.contains(c)){
            courses.remove(c); // remove the course
        return true;
    }
        else {
            return false;
        }
    }
    // getters and setters(wrapping data into sinlge entities)
    public String getName(){
        return name;
    }
    public int getSeatNo(){
        return seatNo;
    }
    public void set(String name , int seatNo){
        this.name = name;
        this.seatNo = seatNo;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public void setCourses(List<Course> courses){
        this.courses = courses;
    }
    // toString method
   
    public String toString(){
        return "StudentName: "+name+"\nSeatNo: "+seatNo+"\nCourses: "+courses;
    }
    // Shallow copy bc of arraylist
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}