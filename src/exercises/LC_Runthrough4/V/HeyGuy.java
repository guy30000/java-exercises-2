package exercises.LC_Runthrough4.V;

public class HeyGuy {

    private String message = "Hello World";
    public String message2 = "test";

    void sayHello() {

        String message = "Goodbye World";
        System.out.println(message + "!"); //goodbye
        System.out.println(this.message);   //hello

    }

    public static void main(String[] args) {
        HeyGuy hello = new HeyGuy();
        hello.sayHello();
    }

}




