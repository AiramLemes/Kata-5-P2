
package controller;

import java.util.HashMap;
import java.util.Map;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderDB;



public class Kata5_P2 {
   
    public static void main(String[] args) {
        execute();
    }
    
    
    public static void execute() {
        output();
    }
    
    
    
    public static MailListReaderDB input() {
        MailListReaderDB correos = new MailListReaderDB();
        return correos;
    }
    
    
    public static MailHistogramBuilder process() {
        MailHistogramBuilder histogramBuilder = new MailHistogramBuilder();
        return histogramBuilder;
    }
    
    
    
    public static void output() {
        new HistogramDisplay(process().builder(input().read())).execute();
    }
    
}