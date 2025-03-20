class Lab544{
public static void main(String as[]){
char chArr[]={'S','R','I','N','I','V','A','S',' ','D'};
String str1=String.valueOf(chArr);
System.out.println(str1);
String str2=String.valueOf(chArr,3,5);
System.out.println(str2);
String str3=String.valueOf(chArr,5,3);
System.out.println(str3);
}
}