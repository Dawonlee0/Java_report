package _8_상속;

class Course{
     public String code;
     public String name;

     public Course(String code, String name){
         this.code = code;
         this.name = name;

     }

}

class OnlineCourse extends Course{
    public OnlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

class OfflineCourse extends Course{
    public OfflineCourse(String code, String name){
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);

    }
}
