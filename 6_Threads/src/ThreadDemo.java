public class ThreadDemo {

    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            //Thread object = new ThreadExample();
            Thread object = new Thread(new ThreadRunnable());
            object.start();
        }

        ThreadClock obj = new ThreadClock();
        obj.start();

    }
}
