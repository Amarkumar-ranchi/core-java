//Name Pattern
class Lab576{
public static void main(String as[]){
String exp6="[A-Z][A-Za-z ]*";
System.out.println("".matches(exp6));
System.out.println("sri nivas".matches(exp6));
System.out.println("Sri nivas".matches(exp6));
System.out.println("Sri Ni Vas".matches(exp6));
System.out.println("Sri nivas99".matches(exp6));
}
}