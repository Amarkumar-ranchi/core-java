import java.util.*;
class Lab703{
public static void main(String args[]) {
Vector myvector = new Vector();
myvector.addElement(10);
myvector.addElement(20);
myvector.addElement(30);
myvector.addElement("JLC");
myvector.addElement(99.99);
System.out.println(myvector);
Enumeration enm = myvector.elements();
while(enm.hasMoreElements()){
Object x = enm.nextElement();
System.out.println(x);
}
}
}