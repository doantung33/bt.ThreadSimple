public class NumberGenerator implements Runnable {
    public synchronized void generator(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Number "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        generator();
    }
}
