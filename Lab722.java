import java.util.*;
class Lab722{
public static void main(String args[]) {
List<Integer> mylist = new ArrayList<>();
mylist.add(10);
mylist.add(20);
mylist.add(30);
mylist.add(40);
mylist.add(50);
System.out.println(mylist);
Iterator<Integer> it = mylist.iterator();
while(it.hasNext()){
Integer x = it.next();
if(x==40){
it.remove();
break;
}
}
System.out.println(mylist);
}
} 