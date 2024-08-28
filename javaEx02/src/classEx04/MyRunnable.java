package classEx04;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 스레드가 실행할 작업 정의
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable is running - Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
