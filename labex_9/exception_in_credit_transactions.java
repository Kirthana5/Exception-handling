/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class exception_in_credit_transactions {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obj creation of class which gets input and checks for credit limit
        credit_transcations obj=new credit_transcations();
        
        try
        {
            //calling method t
            obj.credit_limit_checker();
        }
        catch(credit_limit_exception e)
        {
            System.out.println(e);//to get exception with class name
            System.out.println("EXCEPTION: "+e.getMessage());//to get exception txt alone without class name
        }
    }
    
}

//class for credit transactions
class credit_transcations
{
    Scanner val=new Scanner(System.in);
    double amount;
    
    //constructor to get amount from user
    credit_transcations()
    {
        System.out.println("Enter amount to be credited:");
        amount=val.nextDouble();
    }
    
    //method to check credit limit
    void credit_limit_checker() throws credit_limit_exception
    {
        System.out.println("========================\nLIMIT OF AMOUNT TO BE CREDITED:\nMinimum amount to be credited:Rs.100/-\nMaximum amount to be credited per day:Rs.50,000/-\n========================");
        if(amount<100)
            throw new credit_limit_exception("Amount to be credited shouldn't be less than Rs.100  !!");
        if(amount>50000)
            throw new credit_limit_exception("Amount to be credited shouldn't be more than Rs.50,000  !!");
        System.out.println("Amount credited sucessfully !!\nCredited amount:Rs."+amount+"/-");
            
    }
}

//userdefined exception
class credit_limit_exception extends Exception
{
    //constructor
    credit_limit_exception(String error_msg)
    {
        super(error_msg);
    }
}

