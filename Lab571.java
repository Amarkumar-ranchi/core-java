class Lab571{
public static void main(String as[]){
String exp1="[A-Z]";
String str="JLC";
boolean b=str.matches(exp1);
System.out.println(b);
System.out.println("J".matches(exp1));
System.out.println("a".matches(exp1));
System.out.println("A9".matches(exp1));
}
}