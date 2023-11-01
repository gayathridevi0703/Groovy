package com.iinterchange.grails

import grails.gorm.MultiTenant


class School implements MultiTenant<School>{

  String courseName
  String  studentName 
   
}

