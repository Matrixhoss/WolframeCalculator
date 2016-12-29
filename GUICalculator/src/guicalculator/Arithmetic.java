/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicalculator;
//asdasdasdasdasdasd
/**
 *
 * @author Hossam
 */
public class Arithmetic extends Calculations{
     public  String Calculate (String equation){
         double x;
         boolean y = false ;
         try {
              x= Double.parseDouble(Solver.solve(equation, "Result"));
         } catch (Exception e) {
             y = true;
         }
         if (y == false) {
             return Solver.solve(equation, "Result");
         }else {
         return Solver.solve(equation, "Decimal approximation");
         }
     
     }
}
