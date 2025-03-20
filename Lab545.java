class Customer{
public String toString(){
return "I am Customer";
}
}
class Account{}
class Lab545{
public static void main(String as[]){
Customer cust=new Customer();
Account acc=new Account();
String str1=String.valueOf(cust);
System.out.println(str1);
String str2=String.valueOf(acc);
System.out.println(str2);
}
}