class Lab536{
public static void main(String as[]){
String str1=new String("JLC");
String str2=new String("JLC");
String str3=new String("MyJLC");
System.out.println(str1==str2);
System.out.println(str2==str3);
System.out.println(str1==str3);
System.out.println(str1.equals(str2));
System.out.println(str2.equals(str3));
System.out.println(str1.equals(str3));
}
}