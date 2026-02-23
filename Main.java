// Day 1/60 of coding
// Going through arrays and using build in functions

public class Main {
    public static void main(String[] args) {
        String[] Fruits = {"Apple","Orange","Banana", "Coconut"};
        //System.out.println(Fruits[0]); // Printing array using index

        Fruits[0]= "Pineapple"; // Changing array values using index
        //System.out.println(Fruits[0]);

        // Enhanced for loop
        for (String fruit : Fruits){
            System.out.println(fruit);
        }

        // For loop
        for (int i=0; i < Fruits.length; i++){
            System.out.println(Fruits[i]);
        }
    }
}