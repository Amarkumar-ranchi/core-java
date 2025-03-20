class Lab564{
public static void main(String as[]){
String str="Hello Guys How are you Guys Ok Ok";
String strArr1[] = str.split("Guys");
System.out.println(strArr1.length);
for(String x:strArr1)
System.out.println(x);
}
}