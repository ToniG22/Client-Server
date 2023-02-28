import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String args[]){

        Semaphore   sem = new Semaphore(1);

        ClientThread client = new ClientThread(8888,1,sem,2000);
        client.start();

        ClientThread client2 = new ClientThread(8888,2,sem,1000);
        client2.start();

        ClientThread client3 = new ClientThread(8888,3,sem,2000);
        client3.start();

        ClientThread client4 = new ClientThread(8888,4,sem,1000);
        client4.start();
    }
}