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
public class runtime_exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        //RUNTIME EXCEPTIONS
       
        //1...........ArithmeticException
        try
        {
            System.out.println("Enter values of a and b:");
            int a=val.nextInt();
            int b=val.nextInt();
            System.out.println("Division of entered numbers: "+(a/b));
        }
        catch(ArithmeticException a)//rises exception whenever the denominator value is zero (0)
        {
            System.out.println(a);//to get exception with class name------->java.lang.ArithmeticException: / by zero
            System.out.println(a.getMessage());//to get exception txt alone without class name----->/ by zero
            System.out.println("Divide by zero");//to have customised txt over exception-------->Divide by zero
        }
        
        System.out.println("==================================");
       
        
        //2..............ArrayIndexOutOfBoundsException
        try
        {
            int arr[];
            arr=new int[20];
            System.out.println("Enter index and the data to be inserted:");
            int index=val.nextInt();
            int data=val.nextInt();
            arr[index]=data;
            System.out.println("arr["+index+"]="+data);
        }
        catch(ArrayIndexOutOfBoundsException arr)//rises exception whenever the index is either negative or greater than or equal to the size of the array
        {
            System.out.println(arr);
        }
        
        System.out.println("==================================");
        
        
        
        //3.............NumberFormatException
        try
        {
            System.out.println("Enter the integer:");
            float x=Integer.parseInt(val.next());//x can be of any numeric data type
            System.out.println("Entered number: "+x);
        }
        catch(NumberFormatException n)//rises exception whenever string(in alphabets) is entered which can't be converted to any numeric types
        {
            System.out.println(n);
        }
        
        System.out.println("==================================");       
        
        
        //4..............StringIndexOutOfBoundsException
        try
        {
            System.out.println("Enter the string:");
            String str=val.next();
            System.out.println("Substring :"+str.substring(6));
            
        }
        catch(StringIndexOutOfBoundsException s)//rises exception whenever the index is either negative or greater than the size of the string
        {
            System.out.println(s);
        }
        

        //if the type of exception is not known we can have Exception super class in catch ,so that it'll take care of the type of exception
        catch(Exception e)//super class of all exceptions
        {
            System.out.println(e);
        }
        
        System.out.println("==================================");
        
        
    }
    
}
