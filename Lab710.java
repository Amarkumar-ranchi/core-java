import java.util.*;
class Lab710{
public static void main(String args[]) {
List courseList = new ArrayList();
courseList.add("Java");
courseList.add("DSA");
courseList.add("Spring");
courseList.add("React");
System.out.println(courseList);
List numsList = new ArrayList();
numsList.add(10);
numsList.add(20);
numsList.add(30);
System.out.println(numsList);
System.out.println(courseList);
courseList.add(numsList);
System.out.println(courseList);
System.out.println(courseList.contains("Java"));
System.out.println(courseList.contains(numsList));
}
} 
