package com.iinterchange.grails


@EqualsAndHashCode(includes='studentName')
class Student implements Serializable{
 String studentName 
 String rollNo

  Set<Course> getAuthorities(){

  }
  static constraints={

    rollNo nullable : false ,blank : false
    studentName nullable : false ,blank : false
}

 static mappings={
   rollNo column: '`rollNo`'
 }
}