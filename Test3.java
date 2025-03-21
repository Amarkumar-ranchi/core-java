class Test3{
public static void main(String args[]){
byte by=123;
new A().show(by);
}
}
class A{
void show(int ab){
System.out.println("show -> int");
}
void show(char ch){
System.out.println("show -> char");
}
}