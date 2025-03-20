import java.util.*;
class Lab732{
public static void main(String args[]) {
Set<String> courseSet = new HashSet<>();
courseSet.add("Java");
courseSet.add("SQL");
courseSet.add("DSA");
courseSet.add("Spring");
courseSet.add("DSA");
courseSet.add("React");
//courseSet.add(123);
System.out.println(courseSet);
System.out.println("----Using Iterator-------");
Iterator<String> it = courseSet.iterator();
while(it.hasNext()){
String str = it.next();
System.out.println(str);
}
}
} 