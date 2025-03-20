import java.util.*;
class Lab731{
public static void main(String args[]) {
Set courseSet = new HashSet();
courseSet.add("Java");
courseSet.add("SQL");
courseSet.add("DSA");
courseSet.add("Spring");
courseSet.add("DSA");
courseSet.add("Spring");
courseSet.add("Java");
courseSet.add(123);
courseSet.add(99.99);
System.out.println(courseSet);
List<Integer> mylist = new ArrayList<>();
mylist.add(10);
mylist.add(20);
mylist.add(30);
mylist.add(40);
mylist.add(40);
mylist.add(50);
mylist.add(50);
System.out.println(mylist);
Set<Integer> myset = new HashSet<>(mylist);
System.out.println(myset);
}
}