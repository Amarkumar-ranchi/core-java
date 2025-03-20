class Hai{
Hai(int a){
System.out.println("Hai-1 arg ");
}
}
class Hello extends Hai {
Hello(){
System.out.println("Hello-0 arg");
super(10);
}
}
class Lab414{
static public void main(String args[]){
new Hello();
} }


/* error: constructor Hai in class Hai cannot be applied to given types;
Hello(){
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Lab414.java:9: error: call to super must be first statement in constructor
super(10);*/