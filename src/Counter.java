public class Counter {
    private static int counter;

    public Counter(){
        this.counter = 0;
    }

    public void addOne(){
        this.counter++;
        System.out.println(this.counter);
    }
}
