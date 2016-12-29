package guicalculator;

public class Number extends Converter {

    private String Base;

    public Number(String from, String Base) {
        super(from);
        this.Base = Base;
    }

    public String convert(String fn, String tn) {
        String x;
        char[] y;
        char[] z;
        switch (Base) {
            case "Decimal":
                Base="_10";
                break;
            case "Binary":
                Base="_2";
                break;
            case "Hexadecimal":
                Base="_16";
                break;
            case "Octal":
                Base="_8";
                break;
 
        }
        x = from +Base + " " + fn + " to " + tn;
        to = Solver.solve(x, "Result");
        y = to.toCharArray();
        z = tn.toCharArray();
        x = "";
        for (int i = 0; i < y.length; i++) {
            if (y[i] == z[0]) {
                break;
            }
            x = x + y[i];
        }
        return x;

    }
}
