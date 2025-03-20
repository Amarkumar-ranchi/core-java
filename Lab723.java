import java.util.*;
class Lab723{
public static void main(String args[]) {
List<Integer> mylist = new ArrayList<>();
mylist.add(10);
mylist.add(20);
mylist.add(30);
mylist.add(40);
mylist.add(50);
mylist.add(60);
System.out.println(mylist);
ListIterator<Integer> it =
mylist.listIterator();
while(it.hasNext()){
Integer x = it.next();
if(x==30){
it.add(90);
break;
}
}
System.out.println(mylist);
}
}