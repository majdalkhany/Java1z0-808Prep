public class HelloWorld {
    public static void main(String[] args) {
        /*
         * To run this in the command prompt, run:
         * 1- javac HelloWorld.java
         * 2- java HelloWorld
         * - if you want to pass in an argument(in this case, a string 'test'), run this
         * instead:
         * java HelloWorld test
         */
        System.out.println("Hello World!");

        if (args.length == 1) {
            System.out.println("Hello " + args[0] + ", how are you?");
        }
    }
}