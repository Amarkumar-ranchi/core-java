import java.util.*;
class Lab721{
public static void main(String args[]) {
Vector<Integer> myvector = new
Vector<Integer>();
myvector.add(10);
myvector.add(20);
myvector.add(30);
myvector.add(40);
myvector.add(50);
System.out.println("1.Using Enumeration");
Enumeration<Integer> enm =
myvector.elements();
while(enm.hasMoreElements()){
Integer x = enm.nextElement(); //
System.out.println(x);
}
System.out.println("2.Using Iterator");
Iterator<Integer> it = myvector.iterator();
while(it.hasNext()){
Integer x = it.next();
System.out.println(x);
}
}
} 
