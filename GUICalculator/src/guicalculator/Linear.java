package guicalculator;


public class Linear extends Calculations{
    
    public  String Calculate (String equation){
     String s =Solver.solve(equation, "Solution");
         if(s.equals("")){
         return "Cant Solve the equation ";
         }
         for (int i = 0; i < s.length(); i++) {
             if (s.toCharArray()[i] == ''||s.toCharArray()[i] == '') {
                StringBuilder ss = new StringBuilder(s);
                ss.setCharAt(i, '=');
                s = ss.toString();
             }
         }
         System.out.println(s);
         return s ;
    }
    
}
