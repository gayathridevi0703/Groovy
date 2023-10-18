class SetMap2{
    static void main(String[] args){
 //set    
Set fSet = ["apple", "banana", "cherry"] 

//map
def fMap = [a : "apple",b : "banana",c : "cherry"]


println(fSet)
println(fMap)
   //accessing in set
def fnSet = fSet.contains("apple")
println("Is 'apple'in set $fnSet")

// accessing in map
def fnMap = fMap["a"]
println("Value for key 'a' in Map: $fnMap")

// adding elemenets in map
fMap["d"] = "date"
println("Map: $fMap")

    // removing elemenets in set
fSet.remove("banana")
println("Set : $fSet")


// removing elemenets in set
fMap.remove("b")
println("Map: $fMap")

    } 
}