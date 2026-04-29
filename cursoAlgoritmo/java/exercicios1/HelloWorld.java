package exercicios1;

public class HelloWorld {

    private String msg;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMsg("Hello World!");
        helloWorld.printMessage();
    }

    public void printMessage() {
        System.out.println(this.msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
