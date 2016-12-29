
package guicalculator;


public class Unit extends Converter{
 
    public Unit(String from){
        super(from);
    }
     public String convert(String fu ,String tu){
        String x;
        x=from+" "+fu+" to "+tu;
        to=Solver.solve(x);
                return to;
    }
}
