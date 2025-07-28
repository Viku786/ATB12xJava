package Ex_20_OOPS_Super_Abstraction;

public class Lab_180_Interview_Q {
}

interface I11{}
interface I12{}
class A1{}
class A2{}
class test1 extends A1{}
//class test2 extends A1,A2{} -> Multiple inheritance not possible

class test2 implements I11{}
class test3 implements I11,I12{}
class test4 extends A1 implements I11,I12{}
//class test5 implements I12 extends A1{} -> wrong operation
//interface I12 extends A1{}