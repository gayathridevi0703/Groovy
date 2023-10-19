

class Duplicate {

    static void main(String[] args){

        int [] arr=[10,10,15,16,17,18,19,20,20]

       

        int count=0

        for(int i=0;i<arr.size();i++){

            for (int j=i+1;j<arr.size();j++){

                if(arr[i]==arr[j]){            

                    arr[j]=0                

                }

            }

        }

        for(int i=0;i<arr.size();i++){

            if(arr[i]!=0){

                print (arr[i] + " ")

            }

        }

   }

}