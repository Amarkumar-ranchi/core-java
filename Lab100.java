class Lab100{
public static void main(String as[]){
byte b=90;
 b=b+9;
System.out.printrln(b);
}
}

/*error: incompatible types: possible lossy conversion from int to byte
b=b+9;
   
Lab100.java:5: error: cannot find symbol
System.out.printrln(b);*/