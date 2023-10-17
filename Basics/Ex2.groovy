class Ex2{
    static void main(String[] args){
        String name='Gayathri';
        String reverse='';
        for(int i=name.length()-1;i>=0;i--){
            
            reverse=reverse+name.charAt(i);
        }
        println("reverse of string is "+reverse);
    }
}