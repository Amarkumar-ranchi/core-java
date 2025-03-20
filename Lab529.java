public class Lab529{
public static void main(String[] args) {
String str1 = "JLC";
String srt2 = new String("JLC");
String str3 = st2.intern();
System.out.println(str1 == str2);
System.out.println(str1 == str3);
System.out.println(str2 == str3);
System.out.println();
String str4 = "OK".intern();
String str5 = "OK";
System.out.println(str4 == str5);
}
}