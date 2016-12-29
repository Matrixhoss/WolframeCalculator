
package guicalculator;


public class Unit extends Converter{
 
    public Unit(String from,String to){
        super(from,to);
    }
     public void convert(String fu ,String tu){
        String x;
        x=from+" "+fu+" to "+tu;
        to=Solver.solve(x);
    
    }
}
