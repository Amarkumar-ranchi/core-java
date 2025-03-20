import java.util.*;
class Lab729{
public static void main(String as[]){
LinkedList courseList = new LinkedList();
System.out.println(courseList.size());
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
System.out.println(courseList);
courseList.add(2,"Spring Boot");
System.out.println(courseList);
System.out.println("-----------------------");
System.out.println(courseList.getFirst());
System.out.println(courseList.getLast());
courseList.addFirst("Hello");
courseList.addLast("Hai");
System.out.println(courseList);
System.out.println(courseList.removeFirst());
System.out.println(courseList.removeLast());
System.out.println(courseList);
System.out.println("-----------------------");
System.out.println("----Using Iterator---");
Iterator it=courseList.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
} 