package bai3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i=2;i<=100;i++)
            if (kiemTra(i)){
                System.out.println(i);
            }
        }


    public boolean kiemTra(int number) {
        if (number < 1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
  }

    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread thread = new Thread(lazyPrimeFactorization);
        thread.start();
    }
}
