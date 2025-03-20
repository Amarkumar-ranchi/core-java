class Lab562{
public static void main(String as[]){
String str="Srinivas";
byte destArr[] = new byte[10];
destArr[0]=65;
destArr[1]=66;
str.getBytes(0,3,destArr,3);
for(byte by:destArr)
System.out.println(by);
}
}