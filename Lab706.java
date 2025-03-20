import java.util.*;
class Lab706{
public static void main(String args[]) {
Hashtable<String,Integer> myht = new
Hashtable<String,Integer>();
myht.put("aaa",10);
myht.put("bbb",50);
myht.put("sri",90);
System.out.println(myht);
System.out.println(myht.get("sri"));
Enumeration<String> enm = myht.keys();
while(enm.hasMoreElements()){
String mykey = enm.nextElement();
Integer myval = myht.get(mykey);
System.out.println(mykey+"\t"+myval);
}
}
}