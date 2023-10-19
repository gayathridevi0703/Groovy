class Palindrome {

 

    public static void main(String[] args) {

    

        String Str = "WOW";

 

        String rev = "";

        for(int i = Str.size() - 1; i >= 0; i --) {

 

            rev= rev + Str.charAt(i);

 

        }


        //to check the condition

        if (Str.equalsIgnoreCase(rev)) {

            //Print the statement

            println("String is Palindrome..");

 

        } else {

            //Print the statement

            println(" string is NOT a Palindrome..");

 

        }

 

    }

 

}
 
