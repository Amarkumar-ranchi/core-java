class Lab586{
public static void main(String as[]){
StringBuilder sb1=new StringBuilder("JLC");
StringBuilder sb2=new StringBuilder("JLC");
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));
//Option 1:
String str1=sb1.toString();
String str2=sb2.toString();
System.out.println(str1.equals(str2));
//Option 2:
String str=sb1.toString();
System.out.println(str.contentEquals(sb2));
}
} 
