package springbootstarterweb.demo;

public class Message implements MessageLoader{
    private String content;

    public Message(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
