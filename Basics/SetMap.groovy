 /*Create a Map and set and explain the difference between them in Groovy/grails*/
class SetMap{
   static void  main(String[] args){

  //defining map key and value pair
  //map declared by def keyword followed by variable name
  //key must be unique and values will accept duplicates
    def map=[student:'gayathri',class:'mca',specialization:'computer science',extractivity:'sports',heigth:5.6]

 //fetching map
    println (map)
 //fetching value using key 
    println(map.get('heigth'))

    
 //declaration of set
 //declaring using set keyword followed by variable name
 //values must be unique dublicate values will not be accepted
    Set  num=[1,2,3,4,5,6,7,8,9,10,10]
  //contains only data elements  

    println(num)


   }
}
