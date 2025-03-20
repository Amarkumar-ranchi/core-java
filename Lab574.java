class Lab574{
public static void main(String as[]){
String exp4="[A-Za-z0-9]*";
System.out.println("JLC99".matches(exp4));
System.out.println("99".matches(exp4));
System.out.println("".matches(exp4));
System.out.println("jlc".matches(exp4));
System.out.println("MyJlc".matches(exp4));
System.out.println("Jlc9".matches(exp4));
System.out.println("Jlc$9".matches(exp4));
}
}