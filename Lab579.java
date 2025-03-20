// Phone Pattern
class Lab579{
public static void main(String as[]){
String exp9="[6-9][0-9]*";
System.out.println("jlc99".matches(exp9));
System.out.println("".matches(exp9));
System.out.println("3".matches(exp9));
System.out.println("123456".matches(exp9));
System.out.println("6".matches(exp9));
System.out.println("923456".matches(exp9));
}
}