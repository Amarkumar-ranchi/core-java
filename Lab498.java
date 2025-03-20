interface Inter1{ }
interface Inter2{ }
class A{}
class B{}
class Hello1 extends A{} //OK
// class Hello2 extends A,B{} //Not OK
class Hello3 implements Inter1{} //OK
class Hello4 implements Inter1,Inter2{} //OK
interface Inter3 extends Inter1{}
interface Inter4 extends Inter1,Inter2{}
//interface Inter5 implements Inter1{} //Not OK
//interface Inter6 implements Inter1,Inter2{} //Not OK
//interface Inter7 extends A{}
//interface Inter8 implements A{}