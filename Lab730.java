import java.util.*;
class Lab730{
public static void main(String as[]){
List courseList = new ArrayList();
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
courseSet.add("Spring");
courseList.add("Spring Boot");
courseList.add("React");
System.out.println(courseList);
System.out.println("----Using Iterator---");
ListIterator lit = courseList.listIterator();
while(lit.hasNext()){
System.out.println(lit.next());
//lit.add("Hello"); //OK
//lit.remove(); //OK
//lit.set("Hello"); //OK
courseList.add("Python");
}
}
} 
