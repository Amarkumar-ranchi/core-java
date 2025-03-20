class Lab558{
public static void main(String as[]){
String str="Srinivas";
String str1=str.replace('i','I');
System.out.println(str1);
String str2=str.replace("n","N");
System.out.println(str2);
String str3=str.replace("ni"," Hello ");
System.out.println(str3);
String str4=str3.replace(" Hello ","ni");
System.out.println(str4);
}
}