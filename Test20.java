public class Test20 {
public static void main(String[] args) {
new Hello();
System.out.println("OK");
System.gc();
}
}
class Hello {
protected void finalize() throws Throwable {
System.out.println("Hello -> finalize()");
}
} 
