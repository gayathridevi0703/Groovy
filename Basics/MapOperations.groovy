class MapOperations{

    static void main(String[] args){
   //defining map
   def map=[name:'Gayathri',city:'Chennai',Qualification:'Mca',time:'2:00',extracurricular:null,name:'vini',Qualification:'Mca',name:'Gayathri']

   println(map)
   //fetching key
   println(map.get('time'))
   println(map.get('city'))
 
  //changing key values
   map['City']='Madurai'
   map.extracurricular='sports'
  //removing some vlaues
   def minusMap=map.minus([time:'2:00'])

  //printing map values

   println(map)
   println(minusMap)

    }}