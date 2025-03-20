class Lab202 {
public static void main(String jlc[]){
double d=9.9;
int arr1[]=new int[d];
System.out.println(arr1.length);
float f=5.5F;
int arr2[]=new int[f];
System.out.println(arr2.length);
long x=99L;
int arr3[]=new int[x];
System.out.println(arr3.length);
}
}


/*error: incompatible types: possible lossy conversion from double to int
int arr1[]=new int[d];
                   
Lab202.java:7: error: incompatible types: possible lossy conversion from float to int
int arr2[]=new int[f];
                   
Lab202.java:10: error: incompatible types: possible lossy conversion from long to int
int arr3[]=new int[x];*/
                   