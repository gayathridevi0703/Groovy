class Largestnum{
    static void main(String[] args){
        //defining array
       int[] num=[1,5,6,7,10,99,34,45];
        //operator overloading
        //first way
        int largest=num.max();
        println("The largest number is  "+largest);
        //seciond way
        int max=num[0];
        for(int i=0;i<num.size();i++){
            while(num[i]>max){
                max=num[i];
            }
        }

        println("the largest number is "+max);
    }
}