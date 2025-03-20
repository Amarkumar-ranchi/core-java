class Lab573{
public static void main(String as[]){
String exp3="[A-Za-z]*";
System.out.println("JLC".matches(exp3));
System.out.println("J".matches(exp3));
System.out.println("".matches(exp3));
System.out.println("jlc".matches(exp3));
System.out.println("MyJlc".matches(exp3));
System.out.println("Jlc9".matches(exp3));
}
}