class Palindrome {

 

    public static void main(String[] args) {
         
        //original string 
        String Str = "WOW";

        //temp variable
        String temp = "";

        for(int i = Str.size() - 1; i >= 0; i --) {

            temp= temp + Str.charAt(i);

        }
     //if else statement
        if (Str.equalsIgnoreCase(temp)) {


            println(" is Palindrome..");

        } else {


            println(" NOT a Palindrome..");

        }

 

    }

 

}
 
