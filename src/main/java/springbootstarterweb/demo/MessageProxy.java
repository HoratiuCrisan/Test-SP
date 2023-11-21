package springbootstarterweb.demo;

//Proxy design pattern
public class MessageProxy implements MessageLoader{
    private String path;
    private Message message;

    public MessageProxy(String path) {
        this.path = path;
        this.message = null;
    }

    public Message loadMessage() {
        if (this.message == null) {
            this.message = new Message(path);
        }
        return this.message;
    }

    @Override
    public void print() {
        Message m1 = loadMessage();
        m1.print();
    }
}
