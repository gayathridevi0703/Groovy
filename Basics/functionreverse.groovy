class ReverseNumber{

    static main(args) {


       //original num
        int value = 345677;
       //calling method and storing reversed number
        int rev = reverse(value);
       //printing reversed number
        println(rev)

    }

 
     //method declaration
    public static int reverse(int number){

        int t = 0;

        int num = 0;

        while(number!=0){
       //reverse logic
            t= number%10;

            num = (num*10) + t;

            number = number/10;

        }

        return num;

    }

}