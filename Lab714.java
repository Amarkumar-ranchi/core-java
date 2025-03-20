import java.util.*;
class Lab714{
public static void main(String args[]) {
List<String> courseList = new
ArrayList<>();
courseList.add("Java");
courseList.add("DSA");
courseList.add("Spring");
courseList.add("React");
courseList.add("MicroServices");
System.out.println(courseList);
courseList.add(3,"Spring Boot");
System.out.println(courseList);
//courseList.remove("React");
courseList.remove(4);
System.out.println(courseList);
//courseList.remove(9);
//courseList.remove("DevOps");
System.out.println(courseList.get(1));
System.out.println(courseList.get(4));
//System.out.println(courseList.get(9));
}
}