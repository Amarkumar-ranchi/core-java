class Lab104{
public static void main(String as[]){
int x=10;
(x++)++;

int a=10++;
final int A =10;
A++;
}
}

/* error: unexpected type
(x++)++;
  
  required: variable
  found:    value
Lab104.java:6: error: unexpected type
int a=10++;

  required: variable
  found:    value
Lab104.java:8: error: cannot assign a value to final variable A
A++;*/