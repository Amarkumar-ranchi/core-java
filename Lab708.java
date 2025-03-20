import java.util.*;
class Lab708{
public static void main(String args[]) {
List<String> mylist = new ArrayList<String>();
System.out.println(mylist);
System.out.println(mylist.size());
System.out.println(mylist.isEmpty());
mylist.add("Java");
mylist.add("Spring");
mylist.add("Hibernate");
mylist.add("SpringBoot");
mylist.add("React");
System.out.println(mylist);
System.out.println(mylist.size());
System.out.println(mylist.isEmpty());
System.out.println(mylist.contains("Spring"));
System.out.println(mylist.contains("DSA"));
mylist.remove("Spring");
mylist.add("DSA");
System.out.println(mylist.contains("Spring"));
System.out.println(mylist.contains("DSA"));
System.out.println(mylist);
mylist.clear();
System.out.println(mylist);
}
}