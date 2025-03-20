import java.util.*;
class Lab712{
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
courseList.addAll(numsList);
System.out.println(courseList);
courseList.removeAll(numsList);
System.out.println(courseList);
}
} 
