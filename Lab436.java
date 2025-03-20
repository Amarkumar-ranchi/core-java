package com.myjlc.p3;
import com.myjlc.p1.*;
import com.myjlc.p2.*;
public class Lab436{
public static void main(String args[]){
A ao=new A();
ao.showA();
B bo=new B();
bo.showB();
C co=new C();
co.showC();
D do1=new D();
do1.showD();
E eo=new E();
eo.showE();
}
}


package com.myjlc.p4;
public class Hai{
protected void show(){
System.out.println("Hai - show() ");
}
} 


package com.myjlc.p5;
import com.myjlc.p1.Hai;
public class Hello extends Hai{
public void m1(){
show();
}
} 
