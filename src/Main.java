public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Bob", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(100);
        System.out.println("New score is " + newScore);

        newScore = calculateScore();

        System.out.println("New score is " + calculateScore("Bob", 500));
        System.out.println("New score is " + calculateScore(10));

    }

    // Method Overloading
    // Parameter names are not important when determining if a method is overloaded
    // Return types are not used when determining if a method is overloaded


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calculateScore(double score) {
        return calculateScore("Anonymous", (int)score);
    }


//    public static void calculateScore(){
//        System.out.println("No player name, no player score.");
//    }




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

    // public static void doSomething(int parameterA){
        //method body
    // }
    // public static void doSomething(int parameterB){
        //method body
    // }

    // public static double doSomething(int parameterA){
        //method body
    // }



}