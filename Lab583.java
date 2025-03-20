class Lab583{
public static void main(String as[]){
StringBuilder sb=new StringBuilder(25);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("Hello Guys!!!");
sb.append(true);
System.out.println(sb);
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.insert(6,"JLC ");
System.out.println(sb);
System.out.println(sb.length());
sb.insert(10,true);
System.out.println(sb);
System.out.println(sb.length());
}
}