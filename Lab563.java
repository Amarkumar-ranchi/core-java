class Lab563{
public static void main(String as[]){
String str="Hello Guys How are you Guys";
String strArr1[] = str.split(" ");
System.out.println(strArr1.length);
for(String x:strArr1)
System.out.println(x);
String strArr2[] = str.split(" ",3);
System.out.println(strArr2.length);
for(String x:strArr2)
System.out.println(x);
}
}