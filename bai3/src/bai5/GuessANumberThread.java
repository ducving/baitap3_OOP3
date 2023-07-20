package bai5;

import java.util.Scanner;

public class GuessANumberThread implements Runnable{
    public int score=0;
    public int guessNumber;
    public GuessANumberThread(int guessNumber) {
        this.guessNumber = guessNumber;
    }
    @Override
    public void run(){
        int randomNumber ;
        do {
            randomNumber = (int) (Math.random() * 10 + 1);
            score++;
            System.out.println(Thread.currentThread().getName() + " đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != guessNumber);

        System.out.println(Thread.currentThread().getName()+ " đã đoán ra số " + guessNumber + " trong " + score + " lần đếm");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = scanner.nextInt();

        bai4.GuessANumberThread thread1 = new bai4.GuessANumberThread(number);
        bai4.GuessANumberThread thread2 = new bai4.GuessANumberThread(number);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
