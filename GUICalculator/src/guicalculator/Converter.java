package guicalculator;

public abstract class Converter {

    protected String from;
    protected String to;
    
    public Converter(String from){
    this.from=from;
    
    }

    public abstract void convert(String f, String t);
}