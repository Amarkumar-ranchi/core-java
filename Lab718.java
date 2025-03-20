import java.util.*;
class Lab718{
public static void main(String args[]) {
List<Integer> mylist = new ArrayList<>();
mylist.add(10);
mylist.add(20);
mylist.add(30);
mylist.add(40);
mylist.add(50);
System.out.println(mylist);
ListIterator<Integer> mylistIt = mylist.listIterator();
System.out.println("Forward Order");
while(mylistIt.hasNext()){
Integer x = mylistIt.next();
System.out.println(x);
}
System.out.println("Reverse Order");
while(mylistIt.hasPrevious()){
Integer x = mylistIt.previous();
System.out.println(x);
}
}
} 