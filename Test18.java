class Test18{
public static void main(String
args[]){
int arr[]=new int[5];
System.out.println(arr+1);
}
}

/*output:-error: bad operand types for binary operator '+'
System.out.println(arr+1);
                      ^
  first type:  int[]
  second type: int*/