import java.util.*;
class Lab707{
public static void main(String args[]) {
Properties myprops = new Properties();
myprops.put("aaa",10);
myprops.put("bbb",50);
myprops.put("sri",90);
System.out.println(myprops);
System.out.println(myprops.get("sri"));
Enumeration enm = myprops.keys();
while(enm.hasMoreElements()){
Object mykey = enm.nextElement();
Object myval = myprops.get(mykey);
System.out.println(mykey+"\t"+myval);
}
}
}