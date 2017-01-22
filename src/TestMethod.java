
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class TestMethod {
    public static void main(String[] args) 
    throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
           
        
        try
        {
            Class c=Class.forName("Test");
            Method m=c.getDeclaredMethod("test");
            Object t = c.newInstance();
            Object o= m.invoke(t); 
        } 
        catch (Exception exc)
        {
            System.out.println("Error");
            System.exit(1);
        }
        
        try
        {
            Class c=Class.forName("Test");
            Method m=c.getDeclaredMethod("test2");
            Object t = c.newInstance();
            Object o= m.invoke(t); 
        } 
        catch (Exception exc)
        {
            System.out.println("Have no access to privat method");
            System.exit(1);
        }
    } 
}
