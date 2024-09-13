class Lab4{
 int a;
public static void main(String[]as){
System.out.println(a);
}
}




/*class Lab4{
static int a;
public static void main(String[]as){
System.out.println(a);
}
}*/

// output:0

/*class Lab4{
 int a=5;
static int b=4;
public static void main(String[]as){
System.out.println(a);
System.out.println(b);
}
}*/

/* error: non-static variable a cannot be referenced from a static context
System.out.println(a);*/


/*class Lab4{
 static int a=5;
static int b=4;
public static void main(String[]as){
System.out.println(a);
System.out.println(b);
}
}*/

//output:5 and 4

/*class Lab4{
  int a=5;
static int b=4;
System.out.println(a);
public static void main(String[]as){
System.out.println(b);
}
}*/

/*error: <identifier> expected
System.out.println(a);*/
