import java.util.*;
class Lab734{
public static void main(String args[]) {
Set<String> courseSet = new TreeSet<>();
courseSet.add("Java");
courseSet.add("SQL");
courseSet.add("DSA");
courseSet.add("Spring");
courseSet.add("DSA");
courseSet.add("React");
System.out.println(courseSet);
System.out.println("--Using Iterator----");
Iterator<String> it = courseSet.iterator();
while(it.hasNext()){
String str = it.next();
System.out.println(str);
}
}
}