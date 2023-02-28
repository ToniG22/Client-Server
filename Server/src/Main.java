public class Main {

    public static void main(String args[]){
        //Testing
        ServerThread server = new ServerThread(8888);
        server.run();
    }
}