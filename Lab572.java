class Lab572{
public static void main(String as[]){
String exp2="[A-Z]*";
System.out.println("JLC".matches(exp2));
System.out.println("J".matches(exp2));
System.out.println("".matches(exp2));
System.out.println("jlc".matches(exp2));
System.out.println("jlc9".matches(exp2));
}
}