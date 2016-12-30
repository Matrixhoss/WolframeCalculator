package guicalculator;

public class Arithmetic extends Calculations{
     public  String Calculate (String equation){
         double x1,x2,x3;
         boolean y1 = false ,y2 =false , y3=false ;
         try {
              x1= Double.parseDouble(Solver.solve(equation, "Result"));
         } catch (NumberFormatException e) {
             y1 = true;
         }
//         try {
//              x2= Double.parseDouble(Solver.solve(equation, "Decimal approximation"));
//         } catch (NumberFormatException e) {
//             y2 = true;
//         }
        /* try {
              x3= Double.parseDouble(Solver.solve(equation, "Exact result"));
         } catch (NumberFormatException e) {
             y3 = true;
         }*/
         
         if (y1 == false) {
             return Solver.solve(equation, "Result");
         }
         else if(!Solver.solve(equation, "Decimal approximation").equals("")){
             
             String s =Solver.solve(equation, "Decimal approximation");
             String ss = "";
             for (int i = 0; i < s.length(); i++) {
                 if(s.toCharArray()[i]=='×'){
                    ss = s.substring(i, s.length());
                 }
             }
             if (s.length() > 15){
                s = s.substring(0, 15);
              } 
             return s+ss ;
         }
         else if (y3 == false){
          return Solver.solve(equation, "Exact result");
         }
         else {
         return "Cant be solved";
         }
     
     }
}
