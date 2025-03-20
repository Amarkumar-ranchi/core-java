class Lab582{
public static void main(String as[]){
StringBuilder sb1=new StringBuilder();
System.out.println(sb1.length());
System.out.println(sb1.capacity());
StringBuilder sb2=new StringBuilder("Hello");
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
sb2.append(" Guys!!!");
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
sb2.append("1234567899");
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
sb2.trimToSize();
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
}
}