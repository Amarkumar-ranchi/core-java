import java.util.*;
class Lab744{
public static void main(String args[]) {
//Deque<Integer> myque = new
ArrayDeque<>();
Deque<Integer> myque = new
LinkedList<>();
myque.add(10);
myque.add(20);
myque.add(30);
myque.add(40);
myque.add(50);
System.out.println(myque);
myque.offerFirst(66);
myque.offerLast(99);
System.out.println(myque);
System.out.println("--------------");
System.out.println(myque.peekFirst());
System.out.println(myque.peekLast());
System.out.println(myque);
myque.pollFirst();
myque.pollLast();
System.out.println(myque);
System.out.println("--------------");
System.out.println(myque.peekFirst());
System.out.println(myque.peekLast());
System.out.println(myque);
}
}