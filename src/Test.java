/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */


public class Test implements Testable {
    
    @Override
    public void test() {
        System.out.println("working");
    }
    private void test2(){
        System.out.println("its privat method");
    }
    
}
