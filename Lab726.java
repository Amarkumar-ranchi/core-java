import java.util.*;
class Lab726{
public static void main(String as[]){
List<String> courseList = new ArrayList<>();
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
courseList.add("Spring");
courseList.add("React");
System.out.println(courseList);
ListIterator<String> it = courseList.listIterator();
while(lit.hasNext()){
String element = lit.next().toString();
int index=lit.nextIndex();
System.out.println(index+"\t"+ element);
}
}
} 