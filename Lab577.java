// Email Pattern
class Lab577{
public static void main(String as[]){
String exp7="[A-Za-z0-9]*[@][A-Za-z]*[.][A-Zaz]*";
System.out.println("".matches(exp7));
System.out.println("@.".matches(exp7));
System.out.println("Sri@myjlc.com".matches(exp7));
System.out.println("s@s.com".matches(exp7));
}
}