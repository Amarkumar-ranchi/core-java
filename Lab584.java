class Lab584{
public static void main(String as[]){
StringBuilder sb=new StringBuilder("Hello JLC Guys!!! ");
System.out.println(sb);
System.out.println(sb.length());
sb.deleteCharAt(15);
sb.deleteCharAt(16);
System.out.println(sb);
System.out.println(sb.length());
sb.delete(9,15);
System.out.println(sb);
System.out.println(sb.length());
}
}