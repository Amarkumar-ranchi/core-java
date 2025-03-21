class Test5{
public static void main(String args[]){
B ref=new B();
System.out.println(ref.x);
}
}
class A{
int x=99;
}
class B {
int y=88;
}
/* error: cannot find symbol
System.out.println(ref.x);
                      
  symbol:   variable x
  location: variable ref of type B*/