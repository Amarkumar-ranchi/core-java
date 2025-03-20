class Lab537{
public static void main(String as[]){
String str1=new String("JLC");
String str2=new String("jlc");
boolean b1=str1.equals(str2);
System.out.println(b1);
boolean b2=str1.equalsIgnoreCase(str2);
System.out.println(b2);
}
}