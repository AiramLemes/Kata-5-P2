
package model;

public class Mail {
    
    private String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        
        String[] split = this.mail.split("@");
        return split[1];
    }
    
}
