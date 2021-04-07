package com.reviewclass6;

public class MultipleTasksAtsametime {
    public static void main(String[] args) throws InterruptedException {
       googleChrome();
       intelliJ();
       slack();

        Thread googleChrome=new Thread(() -> {
            System.out.println("google chrome is running");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("google chrome done");
        });


        Thread intelliJ=new Thread(() -> {
            System.out.println("intelliJ  is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("intelliJ  done");
        });

        Thread slack=new Thread(() -> {
            System.out.println("slack  is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("slack  done");
        });

        /*googleChrome.start();
        intelliJ.start();
        slack.start();*/



    }

   public static void googleChrome() throws InterruptedException {
       System.out.println("google chrome is running");
       Thread.sleep(1000);
   }

    public static void intelliJ() throws InterruptedException {
        System.out.println("intelliJ  is running");
        Thread.sleep(5000);
    }

    public static void slack() throws InterruptedException {
        System.out.println("slack  is running");
        Thread.sleep(3000);
    }
}
