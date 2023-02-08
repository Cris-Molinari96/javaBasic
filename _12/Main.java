package javaBasics._12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);

    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     *
     *    Start with a base score of the string's length, this is the starting score. Use .length() on a string
     *
     *    The Maximum starting score is 20, if a score is over 20. Set it to 20.
     *
     *    If the string contains the letter a, -5 from the score
     *
     *    If the string is all lowercase, add 10 to the score.
     *
     *    If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;
        // Start your code here
        String strOne = "Java runs on over 2 billion devices";
        String strTwo = "+31 2 58765446";
        String strThree = "hello world";

        int maxScore = 20 ;

        if(strOne.length() > maxScore ){
            yourScore = maxScore;
            if(strOne.contains("a") ){
                yourScore -= 5 ;
            }
            System.out.println(yourScore); // 15
        }

        if(strTwo.equals(strTwo.toLowerCase())){
            yourScore = strTwo.length();
            yourScore += 10;
                if(yourScore > 20){
                    yourScore *= 2;
                }
            System.out.println(yourScore); // 48
        }

        if(strThree.equals(strThree.toLowerCase())){
            yourScore = strThree.length();
            yourScore += 10;
            if (yourScore > 20){
                yourScore *= 2 ;
            }

            System.out.println(yourScore); // 42
        }
        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourScore;
    }

    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     *
     *    For the meal type sandwich calculate score like the following: 5 * weight
     *
     *    For the meal type of soup calculate score like the following 3 * weight
     *
     *    The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;
        // Start your code here
        double sandwichWeight = Double.valueOf(2.5);
        boolean sandwichOrder = true ;
        double soupWeightOne = Double.valueOf(10);
        boolean soupOrderOne = true ;
        double soupWeight = Double.valueOf(1);
        boolean soupOrder = true ;
        if(sandwichOrder) {
            yourMealScore = sandwichWeight * 5;
            System.out.println(yourMealScore); // 12.5
        }
        if (soupOrderOne){
            yourMealScore = soupWeightOne * 3;
            System.out.println(yourMealScore); // 30
        }
        if(soupOrder){
            if(soupWeight < 5){
                soupWeight = 5 ;
            }
            yourMealScore = soupWeight * 3;
            System.out.println(yourMealScore); // 15
        }

        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}
