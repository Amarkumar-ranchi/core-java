import java.util.*;
class Lab727{
public static void main(String as[]){
List<String> courseList = new
ArrayList<>();
courseList.add("Java");
courseList.add("Spring");
courseList.add("Angular");
courseList.add("Spring");
courseList.add("React");
System.out.println(courseList);
ListIterator<String> lit =
courseList.listIterator(courseList.size())
;
while(lit.hasPrevious()){
String element = lit.previous().toString();
int index=lit.previousIndex();
System.out.println(index+"\t"+ element);
}
System.out.println("-----------------------");
}
} 