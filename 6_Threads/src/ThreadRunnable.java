public class ThreadRunnable implements Runnable {

        public void run() {
            try {
                // Displaying the thread that is running
                System.out.println ("Runnable thread " +
                        ThreadExample.currentThread().getId() +
                        " is running");
            }

            catch (Exception e) {
                // Throwing an exception
                System.out.println ("Exception is caught");
            }
        }
    }


