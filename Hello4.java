class Hello3 {
Boolean b1;
byte b2;
short s;
int a;
long b ;
float f;
double d;
String str;
Hello3 h;
void show(){
System.out.println(b1);
System.out.println(b2);
System.out.println(s);
System.out.println(a);
System.out.println(b);
System.out.println(f);
System.out.println(str);
System.out.println(h);
}
}
class Lab1{
public static void main(String[]as){
Hello3 h =new Hello3();
h.show();
}  
}