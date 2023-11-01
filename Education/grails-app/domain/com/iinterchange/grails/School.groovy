package com.iinterchange.grails

import grails.gorm.MultiTenant
//multitenenant combined domain class --join in database
//persistent domain class

class School implements MultiTenant<School>{

  String courseName//domain depends on User eg:Manager
  String  studentName//domain depends on role 
   
}

