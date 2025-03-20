import java.util.*;
class Lab736{
public static void main(String args[]) {
TreeSet<Integer> myset = new TreeSet<>();
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
Set<Integer> myset1 = myset.subSet(30,70);
System.out.println(myset1);
Set<Integer> myset2 = myset.subSet(30,false,70,false);
System.out.println(myset2);
Set<Integer> myset3 = myset.subSet(30,true,70,true);
System.out.println(myset3);
Set<Integer> myset4 = myset.headSet(50);
System.out.println(myset4);
Set<Integer> myset5 = myset.headSet(50,true);
System.out.println(myset5);
Set<Integer> myset6 = myset.tailSet(60);
System.out.println(myset6);
Set<Integer> myset7 = myset.tailSet(60,true);
System.out.println(myset7);
}
} 