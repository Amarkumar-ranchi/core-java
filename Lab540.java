class Lab540{
public static void main(String as[]){
String str1=new String("JLC");
String str2=new String("JLC");
String str3=new String("jlc");
int x =str1.compareTo(str2);
System.out.println(x);
x =str1.compareTo(str3);
System.out.println(x);
x =str1.compareToIgnoreCase(str3);
System.out.println(x);
}
}