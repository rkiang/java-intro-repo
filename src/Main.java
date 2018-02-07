public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        int thisValue = 5;
        do { // do-while loops, runs/executes statements until true, and executes the next one after the condition is true
            System.out.print(thisValue);
            System.out.print(" * 2 = ");
            thisValue *= 2;
            System.out.println(thisValue);
        } while (thisValue < 100);
    }
}
