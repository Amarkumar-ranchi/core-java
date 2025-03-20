import java.util.*;
class Lab741{
public static void main(String args[]) {
//Deque<Integer> myque = new
ArrayDeque<>();
Deque<Integer> myque = new
LinkedList<>();
System.out.println(myque.size());
System.out.println(myque.isEmpty());
System.out.println(myque);
myque.add(10);
myque.add(20);
myque.add(30);
myque.add(40);
myque.add(50);
System.out.println(myque.size());
System.out.println(myque.isEmpty());
System.out.println(myque);
System.out.println(myque.element());
System.out.println(myque.remove());
System.out.println(myque);
System.out.println("---------------");
System.out.println(myque.element());
System.out.println(myque.remove());
System.out.println(myque);
System.out.println("---------------");
System.out.println(myque.element());
myque.add(60);
System.out.println(myque);
}
}