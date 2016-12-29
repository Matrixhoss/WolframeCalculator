
package guicalculator;


public class Number extends Converter {
    
    public Number(String from,String to){
        super(from,to);
    }
    public void convert(String fn,String tn){
        String x;
        x=from+" "+fn+" to "+tn;
        to=Solver.solve(x);
    
    }
}
