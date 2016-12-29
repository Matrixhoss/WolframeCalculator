package guicalculator;

public abstract class Converter {

    protected String from;
    protected String to;
    
    public Converter(String from,String to){
    this.from=from;
    this.to=to;
    }

    public abstract void convert(String f, String t);
}