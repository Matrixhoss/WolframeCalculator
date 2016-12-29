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
         double x1,x2,x3;
         boolean y1 = false ,y2 =false , y3=false ;
         try {
              x1= Double.parseDouble(Solver.solve(equation, "Result"));
         } catch (NumberFormatException e) {
             y1 = true;
         }
         try {
              x2= Double.parseDouble(Solver.solve(equation, "Decimal approximation"));
         } catch (NumberFormatException e) {
             y2 = true;
         }
         try {
              x3= Double.parseDouble(Solver.solve(equation, "Exact result"));
         } catch (NumberFormatException e) {
             y3 = true;
         }
         
         if (y1 == false) {
             return Solver.solve(equation, "Result");
         }
         else if(y3 == false){
          return Solver.solve(equation, "Exact result");
         }
         else{
         return Solver.solve(equation, "Decimal approximation");
         }
     
     }
}
