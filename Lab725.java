import java.util.*;
class Lab725{
public static void main(String args[]) {
List<String> courseList = new
ArrayList<>();
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
courseList.add("Spring");
courseList.add("React");
System.out.println(courseList);
ListIterator<String> it =
courseList.listIterator();
while(it.hasNext()){
String str = it.next();
if(str.equals("Spring")){
it.set("Spring 5");
break;
}
}
System.out.println(courseList);
}
} 
