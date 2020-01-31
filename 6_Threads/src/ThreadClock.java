public class ThreadClock extends Thread {

    public void run() {
        for (;;) {

            System.out.println("------------------");
            System.out.println("| " + java.time.LocalTime.now() + " |");
            System.out.println("------------------");
            System.out.println();

            try {
                Thread.sleep(1000);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
