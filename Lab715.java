import java.util.*;
class Lab715{
public static void main(String args[]) {
List<String> courseList = new
ArrayList<>();
courseList.add("Java");
courseList.add("DSA");
courseList.add("Spring");
courseList.add("React");
courseList.add("Spring");
courseList.add("MicroServices");
System.out.println(courseList);
System.out.println(courseList.get(1));
System.out.println(courseList.get(2));
System.out.println(courseList.indexOf("DSA"));
System.out.println(courseList.indexOf("Spring"));
System.out.println(courseList.lastIndexOf("Spring"));
System.out.println(courseList);
System.out.println(courseList.set(4,"Spring 5"));
System.out.println(courseList.set(0,"Java 18"));
System.out.println(courseList);
System.out.println(courseList.set(9,"Spring 5.2.9"));
}
} 