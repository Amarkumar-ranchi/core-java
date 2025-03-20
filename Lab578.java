// Email Pattern
class Lab578{
public static void main(String as[]){
String exp8="[a-z][a-z][a-z]*[@][a-z][a-z][az]*[.][a-z][a-z][a-z]*";
System.out.println("".matches(exp8));
System.out.println("@.".matches(exp8));
System.out.println("s@s.com".matches(exp8));
System.out.println("Sri@myjlc.d".matches(exp8));
System.out.println("sd@sd.in".matches(exp8));
System.out.println("sri@myjlc.com".matches(exp8));
}
}