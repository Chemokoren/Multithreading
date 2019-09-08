/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemoExtendsThread;

/**
 *
 * @author kibsoft
 */

class Hi extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
        System.out.println("Hi");
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
//            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
//            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
public class ThreadDemoExtendsThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hi obj1 =new Hi();
        Hello obj2 =new Hello();
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
//            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj2.start();
    }
    
}
