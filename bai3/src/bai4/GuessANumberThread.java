package bai4;

import java.util.Scanner;

public class GuessANumberThread extends Thread {
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
            System.out.println(getName() + " đoán số " + randomNumber);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != guessNumber);

        System.out.println(getName() + " đã đoán ra số " + guessNumber + " trong " + score + " lần đếm");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = scanner.nextInt();

        GuessANumberThread thread1 = new GuessANumberThread(number);
        GuessANumberThread thread2 = new GuessANumberThread(number);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }

}




