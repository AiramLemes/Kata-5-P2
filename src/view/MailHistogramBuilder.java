
package view;
import model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;


public class MailHistogramBuilder {
     
    
    public static Histogram<String> builder (List<Mail> lista) {
        
        
        Histogram<String> histogram = new Histogram();
        
        
        for (Mail mail: lista) {
            histogram.increment(mail.getDomain());
        }
   
    
        return histogram;
    
    
    }

    
}
