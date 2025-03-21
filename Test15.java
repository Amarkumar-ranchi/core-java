public class Test15 {
public static void main(String[] args) {
Student s1 = new Student("Sri");
Student s2 = new Student("Sri");
System.out.println(s1.equals("Sri"));
}
}
class Student {
String name;
Student(String name) {
this.name=name;
}
public boolean equals(Student st) {
return this.name ==st.name;
}
} 
