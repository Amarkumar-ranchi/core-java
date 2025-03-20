class Lab548{
public static void main(String as[]){
String str="Hello Guys";
boolean b1 = str.startsWith("Hello");
System.out.println(b1);
b1 = str.startsWith("Hai");
System.out.println(b1);
b1 = str.startsWith("Guys");
System.out.println(b1);
b1 = str.startsWith("Guys",6);
System.out.println(b1);
b1 = str.startsWith("Hello",5);
System.out.println(b1);
}
}