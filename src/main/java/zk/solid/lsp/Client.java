package zk.solid.lsp;



public class Client {

    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.call("hello");
        bird.fly();
    }

}
