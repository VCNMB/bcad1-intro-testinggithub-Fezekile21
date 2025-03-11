/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {

    public static void main(String[] args) {
        
        newClass nc = new newClass(); //craeting an onbject of new class
       
        nc.helloClass(); // have to use the variable name nc to communicate with the class
        
        System.out.println(nc.strSecondClassVar);  // output the variable from the second class
    }
}
