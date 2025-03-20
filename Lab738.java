import java.util.*;
class Lab738 {
public static void main(String as[]) {
TreeSet<Integer> myset = new TreeSet<>();
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
Set<Integer> myset1 = myset.descendingSet();
System.out.println(myset1);
System.out.println("----------");
Iterator<Integer> it1 = myset1.iterator();
while (it1.hasNext()) {
System.out.println(it1.next());
}
System.out.println("----------");
Iterator<Integer> it2 = myset.descendingIterator();
while (it2.hasNext()) {
System.out.println(it2.next());
}
}
}