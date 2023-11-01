package com.iinterchange.grails

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includes='courseName')
class Course implements Serializable{
   
   String CourseName

    static constraints={
     courseName nullable : false, blank:false, unique: true
    }       
     static mappings={
       
       cache true

     }        
 
}