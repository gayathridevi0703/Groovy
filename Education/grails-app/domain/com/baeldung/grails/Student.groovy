package com.baeldung.grails
class Student {
    String firstName
    String lastName
    String subject

    static hasMany=[Teachers:Teacher]

}
