class Hello {
int a=10;
static int b=20;
void m1(){
System.out.println("m1 - begin");
class Inner{
int x=10;
final static int y=20;
void show(){
System.out.println("Inner - show()");
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);
}
}
Inner inner = new Inner();
inner.show();
System.out.println("m1 - end");
}
void m2(){
//Inner inner = new Inner();
}
}
class Lab507{
public static void main(String as[]){
//Inner inner = new Inner();
Hello h= new Hello();
h.m1();
}
}