import java.util.*;
class Lab747{
public static void main(String args[]) {
PriorityQueue<Integer> pque = new
PriorityQueue<>(Collections.reverseOrder());
pque.offer(50);
pque.offer(40);
System.out.println(pque);
pque.offer(10);
System.out.println(pque);
pque.offer(20);
System.out.println(pque);
pque.offer(60);
System.out.println(pque);
pque.offer(70);
System.out.println(pque);
pque.offer(30);
System.out.println(pque);
}
}