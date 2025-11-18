package ex_0023_Super_Abstraction_SuperKeyword.SuperKeyword.Abstraction;

public class Lab0187_Interview_Q {
}
interface I11{ }
interface I12{}
class A1{}
class B1{}
//class Test2 extends A1,B1{
class Test3 implements I11{ }
class Test4 implements I11, I12{}
class Test5 extends A1 implements I11,I12{}
// extends will always come first
//class Test5 implements I11 extends A{} - Not allowed always extends should be first
//interface I3 extends A1{}