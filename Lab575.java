class Lab575{
public static void main(String as[]){
String exp5="[A-Za-z0-9#@$]*";
System.out.println("JLC*99".matches(exp5));
System.out.println("99".matches(exp5));
System.out.println("".matches(exp5));
System.out.println("jlc".matches(exp5));
System.out.println("MyJlc".matches(exp5));
System.out.println("Jlc9".matches(exp5));
System.out.println("Jlc$9".matches(exp5));
System.out.println("Jlc#@99".matches(exp5));
} 
}