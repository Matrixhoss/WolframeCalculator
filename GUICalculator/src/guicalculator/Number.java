package guicalculator;

public class Number extends Converter {
    
    public Number(String from) {
        super(from);
    }

    public String convert(String fn, String tn) {
        String x;
        char[] y;
        char[] z;
        x = from + " " + fn + " to " + tn;
        to = Solver.solve(x,"Result");
        y = to.toCharArray();
        z = tn.toCharArray();
        x="";
        for (int i = 0; i < y.length; i++) {
            if (y[i]==z[0]){
            break;
            }
            x=x+y[i];
        }
        return x;

    }
}
