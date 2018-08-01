package classes;

import java.util.Date;

public class InstanceVariablesStaticContext {
    
    private Date date1 = new Date();
    private Date date2 = new java.sql.Date(0);
    
    public static void main(String[] args) {
        InstanceVariablesStaticContext ivsc = new InstanceVariablesStaticContext();
        System.out.println("El tipo de date1 es " + ivsc.date1.getClass());
        System.out.println("El tipo de date2 es " + ivsc.date2.getClass());
    }
}
