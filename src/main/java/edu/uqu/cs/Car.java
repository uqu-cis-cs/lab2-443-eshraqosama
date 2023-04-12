package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Car{

    /************ Part 1 **************/
    /**
     * Decalre all instance variables 
     * model of type String
     * inOutGarage of type boolean
     * Make sure they are all private
     * Syntax:
     * private dataType name;
     *
     */
    private String model;
    private boolean InOutGarage;

    /************ Part 2 **************/
    /**
     * Define a default constructor and set 
     * all instance variables to their default values
     * model ="";
     * inOutGarage =false;
     * Syntax:
     * public className (){
     *      //body
     * }
     */
    public Car(){
        model = "";
        InOutGarage = false ;   
    }

    /************ Part 3 **************/
    /**
     * Define all getter methods below
     * for each instance variable
     * Syntax:
     * public dataType getInstanceVariableName (){
     *      return this.InstanceVariableName;
     * }
     */
    public String getmodel(){
        return model;
    }

    public boolean getInOutGarage(){
        return InOutGarage;
    }


    /************ Part 4 **************/
    /**
     * Define all setter methods below
     * for each instance variable
     * public void setInstanceVariableName (parameter){
     *      this.InstanceVariableName= parameter;
     * }
     *
     */
    public void setmodel (String m){
        this.model = m ;
    }

    public void setInOutGarage (Boolean flag){
        this.InOutGarage = flag ;
    }


    /************ Part 5 **************/
    /**
     * Implement the following two methods
     * moveCarOut() to set the inOutGarage flag to false;
     * moveCarIn() to set the inOutGarage flag to true;
     *
     */
   public  boolean moveCarOut (){
    InOutGarage = false;
    return InOutGarage;
   }

   public  boolean moveCarIn (){
    InOutGarage = true;
    return InOutGarage;
   }
   




}