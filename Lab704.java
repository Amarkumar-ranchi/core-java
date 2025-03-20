import java.util.*;
class Lab704{
public static void main(String args[]) {
Vector<Integer> myvector = new Vector<>();
myvector.addElement(10);
myvector.addElement(20);
myvector.addElement(30);
//myvector.addElement("JLC");
//myvector.addElement(99.99);
System.out.println(myvector);
Enumeration<Integer> enm = myvector.elements();
while(enm.hasMoreElements()){
Integer x = enm.nextElement();
System.out.println(x);
}
}
}