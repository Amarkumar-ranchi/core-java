class Lab581{
public static void main(String as[]){
String str1="JLC";
String str2=new String("JLC");
System.out.println(str1==str2);
//StringBuilder sb1="JLC";
StringBuilder sb2=new StringBuilder("JLC9");
StringBuffer sb3=new StringBuffer("JLC");
//System.out.println(sb2==sb3);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb3.length());
System.out.println(sb3.capacity());
}
}