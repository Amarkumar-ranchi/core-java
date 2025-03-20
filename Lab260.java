class Hello{
int a;
}
class Lab260 {
public static void main(String args[]){
System.out.println(Hello.a);
}
} 

/ error: non-static variable a cannot be referenced from a static context
System.out.println(Hello.a);
                        */