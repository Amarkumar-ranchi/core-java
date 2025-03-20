import java.util.*;
class Lab717{
public static void main(String args[]) {
List<String> courseList = new
ArrayList<>();
courseList.add("Java");
courseList.add("DSA");
courseList.add("Spring");
courseList.add("React");
courseList.add("Spring");
courseList.add("Spring Boot");
System.out.println(courseList);
Iterator<String> myit =
courseList.iterator();
while(myit.hasNext()){
String str = myit.next();
System.out.println(str);
}
}
} 