/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicalculator;

/**
 *
 * @author Hossam
 */
public class EquationsHandler extends Calculations{
     public  String Calculate (String equation){
       
     String s =Solver.solve("solve "+equation, "Result");
         if(s.equals("")){
         return "Cant Solve the equation ";
         }
         for (int i = 0; i < s.length(); i++) {
             if (s.toCharArray()[i] == ''||s.toCharArray()[i] == '') {
                StringBuilder ss = new StringBuilder(s);
                ss.setCharAt(i, '=');
                s = ss.toString();
               
             }
         }
         System.out.println(s);
         return s ;
    }
    
}
