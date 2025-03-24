package TestGen4Class;
//Java program to show working
//of user-defined Generic classes

//We use < > to specify Parameter type
class Test<T> {
 // An object of type T is declared
 T obj;
 Test(T obj) { this.obj = obj; } // constructor
 public T getObject() { return this.obj; }
}

//Driver class to test above
class Examp3 {
 public static void main(String[] args)
 {
     // instance of Integer type
     Test<Integer> iObj = new Test<Integer>(15);
     System.out.println(iObj.getObject());

     // instance of String type
     Test<String> sObj  = new Test<String>("Generic Types Differ based on their Arguments");
     System.out.println(sObj.getObject());
     iObj = sObj; // This results an error
 }
}