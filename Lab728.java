import java.util.*;
class Lab728{
public static void main(String as[]){
List courseList = new ArrayList(); //Empty
System.out.println(courseList.size());
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
System.out.println(courseList);
List mycourses = new ArrayList(courseList);
System.out.println(mycourses.size());
mycourses.add("Spring Boot");
System.out.println(mycourses);
Vector v=new Vector();
v.add(10);
v.add(20);
v.add(30);
v.add(40);
v.add(50);
System.out.println(v);
List numList= new ArrayList(v);
System.out.println(numList.size());
System.out.println(numList);
}
}