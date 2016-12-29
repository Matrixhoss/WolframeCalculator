
package guicalculator;


public class Number extends Converter {
    
    public Number(String from){
        super(from);
    }
    public void convert(String fn,String tn){
        String x;
        x=from+" "+fn+" to "+tn;
        to=Solver.solve(x);
    
    }
}
