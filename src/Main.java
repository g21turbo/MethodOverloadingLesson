public class Main {

    public static void main(String[] args) {


    }

    // Method Overloading
    // Parameter names are not important when determining if a method is overloaded
    // Return types are not used when determining if a method is overloaded


    // These are examples of valid overloaded methods
    public static void doSomething(int parameterA){
        //method body
    }

    public static void doSomething(double parameterA){
        //method body
    }

    public static void doSomething(int parameterA, int parameterB){
        //method body
    }

    public static void doSomething(int parameterB, float parameterA){
        //method body
    }

    public static void doSomething(int parameterA, int parameterB, float parameterC){
        //method body
    }

    // These are not valid overloaded methods

    public static void doSomething(int parameterA){
        //method body
    }
    public static void doSomething(int parameterB){
        //method body
    }

    public static double doSomething(int parameterA){
        //method body
    }

}