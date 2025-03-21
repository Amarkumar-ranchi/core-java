class Test25{
public static void main(String args[]){
B ref=new B();
ref.super.x=9090;
ref.show();
} }
class A{ int x=99; }
class B extends A{
String x="JLC";
void show(){
System.out.println(super.x);
}} 
/* error: cannot find symbol
ref.super.x=99;
  symbol:   class ref
  location: class Test25*/