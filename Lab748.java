import java.util.*;
class Lab748{
public static void main(String args[]) {
PriorityQueue<Integer> pque = new
PriorityQueue<>(Collections.reverseOrder());
pque.offer(50);
pque.offer(40);
pque.offer(10);
pque.offer(20);
pque.offer(60);
pque.offer(70);
pque.offer(30);
System.out.println(pque);
System.out.println(pque.peek());
pque.poll();
System.out.println(pque);
System.out.println(pque.peek());
pque.poll();
System.out.println(pque);
System.out.println(pque.peek());
pque.poll();
System.out.println(pque);
System.out.println(pque.peek());
}
} 