package guicalculator;



public abstract class Converter {
    
    private String from;
    private String to;

    public Converter(String f) {
        this.from = f;
      
    }
    
    public abstract void convert();
    
    
}
