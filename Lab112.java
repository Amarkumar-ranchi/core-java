class Lab112{
public static void main(String as[]){
System.out.println(true>=true);
System.out.println(true==0);
}
}

 /*error: bad operand types for binary operator '>='
System.out.println(true>=true);
                       
  first type:  boolean
  second type: boolean
Lab112.java:4: error: incomparable types: boolean and int
System.out.println(true==0);*/