package com.myjlc.part1;
import java.util.*;
class Lab742{
public static void main(String args[]) {
//Deque<Integer> myque = new
ArrayDeque<>();
Deque<Integer> myque = new LinkedList<>();
myque.add(10);
myque.add(20);
myque.add(30);
myque.add(40);
myque.add(50);
System.out.println(myque);
System.out.println("Forward Order");
Iterator<Integer> it1=myque.iterator();
while(it1.hasNext()) {
 Integer x =it1.next();
 System.out.println(x);
}
System.out.println("Reverse Order");
Iterator<Integer>
it2=myque.descendingIterator();
while(it2.hasNext()) {
 Integer x =it2.next();
 System.out.println(x);
}
}
}