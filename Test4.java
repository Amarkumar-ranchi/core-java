/*class Test4{
public static void main(String as[]){
int a=b=c=999;
System.out.println(c);
}
}*/

/* error: cannot find symbol
int a=b=c=999;

  error: cannot find symbol
System.out.println(c);*/
                   
 class Test4{
public static void main(String as[]){
int a,b,c;
 a = b = c= 999;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}

/* class Test4{
public class Test4 {
    public static void main(String[] args) {
        int a, b, c;  // Declare the variables before using them
        a = b = c = 999;  // Initialize all variables to 999
        
        System.out.println(a);  // Print value of 'a'
        System.out.println(b);  // Print value of 'b'
        System.out.println(c);  // Print value of 'c'
    }
}*/
