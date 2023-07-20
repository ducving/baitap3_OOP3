package com.example.baitap1;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i=0 ; i<=10;i++){
            System.out.println(i);
               try {
               Thread.sleep(500);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }
    }

    } class Main{
        public static void main(String[] args) {
            NumberGenerator numberGenerator=new NumberGenerator();

            Thread a=new Thread(numberGenerator);
            System.out.println(a.MAX_PRIORITY);
            a.start();

            Thread a1=new Thread(numberGenerator);
            System.out.println(a.MIN_PRIORITY);
            a1.start();

            System.out.println(numberGenerator.hashCode());

        }
}
