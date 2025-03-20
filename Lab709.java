import java.util.*;
class Lab709{
public static void main(String args[]) {
List<String> mylist = new ArrayList<String>();
mylist.add("Java");
mylist.add("DSA");
mylist.add("Spring");
mylist.add("Hibernate");
mylist.add("SpringBoot");
mylist.add("React");
System.out.println(mylist);
Iterator<String> myit = mylist.iterator();
while(myit.hasNext()){
String str = myit.next();
System.out.println(str);
}
System.out.println("--------------------");
Object myarray[] = mylist.toArray();
for(Object obj:myarray){
System.out.println(obj);
}
}
}