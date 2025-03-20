class Lab561{
public static void main(String as[]){
String str="Srinivas";
char destArr[] = new char[10];
destArr[0]='J';
destArr[1]='L';
destArr[2]='C';
str.getChars(5,8,destArr,4);
for(char ch:destArr)
System.out.println(ch);
}
}