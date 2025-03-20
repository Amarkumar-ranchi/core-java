// Phone Pattern
class Lab580{
public static void main(String as[]){
String exp10="[+91-]*[6-9][0-9]*";
System.out.println("123456".matches(exp10));
System.out.println("+91-123456".matches(exp10));
System.out.println("+91-923456".matches(exp10));
System.out.println("923456".matches(exp10));
}
} 