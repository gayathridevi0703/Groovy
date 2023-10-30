  class ListExerc{
static void main(String[] args){
 //first list original   
def inputList = [99,88,67,90,56,90]
//second list to store fisrt list
def outputList = []

//closure
//using each method to get each single values from first list
inputList.each { 
    item ->
    outputList << [item]
    //left shift
  }


//printing to console

println "Input List: $inputList"
println "Output List: $outputList"
}}