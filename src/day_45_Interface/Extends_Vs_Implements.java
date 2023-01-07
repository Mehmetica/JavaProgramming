package day_45_Interface;
// extends - implements

/*
* class extends class
* interface extends interface(s)
*
* class implements interface(s)
* */

class A implements X,Y,Z{

}

class B extends  A implements X,Y{

}

class C extends B {

}

interface  X{

}
interface Z{

}

interface Y extends X,Z {

}


public class Extends_Vs_Implements {

}
