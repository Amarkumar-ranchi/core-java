class Lab568{
public static void main(String as[]){
byte byArr[] = {65,66,67,68,69,70,71,72};
String str1= new String(byArr);
System.out.println(str1);
System.out.println(str1.length()); //
String str2= new String(byArr,1,6);
System.out.println(str2);
System.out.println(str2.length());
}
}