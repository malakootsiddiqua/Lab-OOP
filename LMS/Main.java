public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course oop1 = new Course("Object Oriented Programming","100");
        Course se1 = new Course("Software Engineering Fundamentals","102");
        Course is1 = new Course("Islamiat","122");
        Course dld1 = new Course("DLD","185");
        Course ml1 = new Course("Multi-Variable Calculas","169");
        Course pst1 = new Course("Pakistan Studies","121");

        System.out.println(oop1.clone());
        oop1.set("Object Oriented Programming","751");
        System.out.println(oop1);
        Student s1 = new Student("Malakoot", 122);
        Student s2 = new Student("Fatima",143);
        Student s3 = new Student("Muzdalfa",128);
        Student s4 = new Student("Kulssom",118);

        s1.addCourse(oop1);
        s1.removeCourse(oop1);
        s1.addCourse(dld1);
        s1.addCourse(is1);
        s2.addCourse(oop1);
        s2.addCourse(ml1);
        s2.addCourse(pst1);
        s3.addCourse(oop1);
        s3.addCourse(dld1);
        s3.addCourse(is1);

        boolean b = s1.removeCourse(dld1);
        System.out.println(b);
        s1.addCourse(dld1);


        CourseList cc = new CourseList();
        cc.addCourse(oop1);
        cc.addCourse(se1);
        cc.addCourse(is1);
        cc.addCourse(dld1);
        cc.addCourse(ml1);
        cc.addCourse(pst1);


        StudentList s = new StudentList();
        s.addStudent(s1);
        s.addStudent(s2);
        s.addStudent(s3);
        s.display();
        System.out.println("============");
        System.out.println("==COURSE LIST==");
        System.out.println("============");
        System.out.println(cc.getCourses());

        System.out.println();
        s.searchBySeatNumber("122");
        s.searchByCourse("DLD");
        
        System.out.println(s.clone());
        s.sortByName();
        System.out.println("After sorting by name:");
        s.display();
    }
}