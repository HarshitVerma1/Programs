/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import mypackage.myInterface;
//import javaapplication8.interface2;

/**
 *import javaapplication8.interface2;
 * @author harsh
 */
public class JavaApplication8 implements myInterface,interface2
{
        public void display()
    {
        System.out.println("Myinterface is called from MyPackage");
    }
        public void display2(){
            System.out.println(b+" ~~ interface called from same packege or directory");
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication8 s = new JavaApplication8();
        System.out.println("Raja");
        s.display();
        
        s.display2();
        
        // TODO code application logic here
    }
    
}
