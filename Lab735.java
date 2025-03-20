import java.util.*;
class Lab735{
public static void main(String args[]) {
Set<Integer> myset = new TreeSet<>();
myset.add(50);
myset.add(10);
myset.add(70);
myset.add(90);
myset.add(60);
myset.add(80);
myset.add(20);
myset.add(40);
myset.add(30);
System.out.println(myset);
System.out.println("----Using Iterator--");
Iterator<Integer> it = myset.iterator();
while(it.hasNext()){
Integer x = it.next();
System.out.println(x);
}
}
}