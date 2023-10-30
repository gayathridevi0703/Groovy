package com.baeldung

class Teacher {

    String firstName
    String lastName
       Student student
    static constraints = {
        student 
  nullable: true
    }

}
