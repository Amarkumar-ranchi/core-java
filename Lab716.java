import java.util.*;
class Lab716{
public static void main(String args[]) {
List<String> courseList = new ArrayList<>();
courseList.add("Java");
courseList.add("DSA");
courseList.add("Spring");
courseList.add("React");
courseList.add("Spring");
courseList.add("MicroServices");
courseList.add("Spring Boot");
courseList.add("AWS");
courseList.add("DevOps");
System.out.println(courseList);
List<String> mylist1 = courseList.subList(3,8);
System.out.println(mylist1);
List<String> mylist2 = courseList.subList(2,5);
System.out.println(mylist2);
}
}