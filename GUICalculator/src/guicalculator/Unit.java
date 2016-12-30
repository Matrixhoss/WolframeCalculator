
package guicalculator;


public class Unit extends Converter{
 
    public Unit(String from){
        super(from);
    }
      public String convert(String fu, String tu) {
        String x;
        char[] y;
        char[] z;
        x = from + " " + fu + " to " + tu;
        to = Solver.solve(x,"Result");
//        y = to.toCharArray();
//        z = tu.toCharArray();
//        x="";
//        for (int i = 0; i < y.length; i++) {
//            if (y[i]==z[0]){
//            break;
//            }
//            x=x+y[i];
//        }
        return to;

    }
}
