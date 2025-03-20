class Hello {
Hello(){
this();
}
}
class Lab418{
static public void main(String args[]){
new Hello();
}
}

/*error: recursive constructor invocation
Hello(){*/