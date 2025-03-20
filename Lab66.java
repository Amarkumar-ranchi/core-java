class Lab66{
public static void main(String as[]){
byte a=19;
byte b=+a;
byte c=-a;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}



/* error: incompatible types: possible lossy conversion from int to byte
byte b=+a;
       
 error: incompatible types: possible lossy conversion from int to byte
byte c=-a;*/