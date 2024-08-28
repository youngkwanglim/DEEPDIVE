package classEx04;

public class MyPrintMain {
    public static void main(String[] args) {
        // Runnable 객체 구현
        //Runnable my = new MyRunnable();

        // 작업 스레드 생성
        //Thread thread = new Thread(my);
        // start() 메서드를 호출해야만 실행

        // 익명 구현 객체 사용
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Runnable is running - Count " + i);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });

        //람다식 사용
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable is running - Count " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
    }
}
