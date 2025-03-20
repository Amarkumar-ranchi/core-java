class Lab212 {
public static void main(String jlc[]){
byte b[]=new byte[5];
System.out.println(b.length);
int a[]= b;
System.out.println(b.length);
}
} 


 /*error: incompatible types: byte[] cannot be converted to int[]
int a[]= b;*/