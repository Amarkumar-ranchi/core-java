class Test28{
public static void main(String args[]){
A ref=new A();
}
}
class A extends Object{
A(){
super(10);
}
} 
/* error: constructor Object in class Object cannot be applied to given types;
super(10);
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length*/