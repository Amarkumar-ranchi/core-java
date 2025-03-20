import java.util.*;
public class Lab737 {
public static void main(String as[]) {
TreeSet<Integer> myset = new
TreeSet<Integer>();
myset.add(50);
myset.add(20);
myset.add(10);
myset.add(80);
myset.add(60);
myset.add(70);
myset.add(90);
myset.add(30);
myset.add(40);
System.out.println(myset);
System.out.println(myset.first());
System.out.println(myset.last());
System.out.println(myset.lower(50));
System.out.println(myset.higher(60));
System.out.println(myset.floor(50));
System.out.println(myset.ceiling(60));
System.out.println(myset);
System.out.println(myset.pollFirst());
System.out.println(myset.pollLast());
System.out.println(myset);
}
}