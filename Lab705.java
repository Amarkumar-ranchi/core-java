import java.util.*;
class Lab705{
public static void main(String args[]) {
Stack<Integer> mystack = new
Stack<Integer>();
mystack.addElement(10);
mystack.addElement(20);
mystack.addElement(30);
mystack.addElement(40);
mystack.addElement(50);
System.out.println(mystack);
Enumeration<Integer> enm =
mystack.elements();
while(enm.hasMoreElements()){
Integer x = enm.nextElement();
System.out.println(x);
}
}
}