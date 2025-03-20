import java.util.*;
class Lab724{
public static void main(String args[]) {
List<String> courseList = new ArrayList<>();
courseList.add("Java");
courseList.add("DSA");
courseList.add("React");
courseList.add("Spring Boot");
courseList.add("MicroServices");
courseList.add("AWS");
courseList.add("DevOps");
System.out.println(courseList);
ListIterator<String> it = courseList.listIterator();
while(it.hasNext()){
String str = it.next();
if(str.equals("Spring Boot")){
it.add("Spring");
break;
}
}
System.out.println(courseList);
}
}