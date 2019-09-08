package ThreadDemoImplementsRunnable;

/**
 * VERSION 1
 */
//class Hi implements Runnable{
//    
//    public void run(){
//        for(int i=0;i<=5;i++){
//        System.out.println("Hi");
//        try {
//            Thread.sleep(1000);
//        } catch (Exception ex) {
//        }
//        }
//    }
//}
//class Hello implements Runnable{
//    public void run(){
//        for(int i=0;i<=5;i++){
//        System.out.println("Hello");
//        try {
//            Thread.sleep(1000);
//        } catch (Exception ex) {
//        }
//        }
//    }
//}
//public class ThreadDemoImplementsRunnable {
//    
//        public static void main(String[] args) {
//        Runnable obj1 =new Hi();
//        Runnable obj2 =new Hello();
//        Thread t1 =new Thread(obj1);
//        Thread t2 =new Thread(obj2);
//        t1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception ex) {
//        }
//        t2.start();
//    }
//}
///**
// * VERSION 2
// */
//
//public class ThreadDemoImplementsRunnable {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Runnable obj1 = new Runnable() {
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception ex) {
//                        //            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        };
//        Runnable obj2 = new Runnable() {
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println("Hello");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception ex) {
////            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//        t1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception ex) {
////            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        t2.start();
//    }
//}
///**
// * VERSION 3
// */
//public class ThreadDemoImplementsRunnable {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Runnable obj1 = () -> {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println("Hi");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception ex) {
//                    //            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        };
//        Runnable obj2 = () -> {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println("Hello");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception ex) {
////            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//        t1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception ex) {
////            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        t2.start();
//    }
//}
///**
// * VERSION 4
// */
//public class ThreadDemoImplementsRunnable {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println("Hi");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception ex) {
//                    //            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        });
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i <= 5; i++) {
//                System.out.println("Hello");
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception ex) {
////            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        t1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception ex) {
////            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        t2.start();
//    }
//}
/**
 * VERSION 4 JOIN & ALIVE
 */
public class ThreadDemoImplementsRunnable {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    //            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority() + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
//            Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }, "Hello Thread");
//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");

//          System.out.println(t1.getName());
//           System.out.println(t2.getName());
        t1.setPriority(Thread.MIN_PRIORITY); //1
        t2.setPriority(Thread.MAX_PRIORITY); //2
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
//            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
