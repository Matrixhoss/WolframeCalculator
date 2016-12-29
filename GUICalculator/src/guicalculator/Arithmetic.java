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
    
        return Solver.solve(equation,"Result");
    
    }
}
