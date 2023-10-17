class Ex2{
    static void main(String[] args){
        //string
        String name='Gayathri';

        //variable to store reverse string
        String reverse='';

        for(int i=name.length()-1;i>=0;i--){
            //reverse logic
            reverse=reverse+name.charAt(i);
        }
        
        println("reverse of string is "+reverse);
    }
}