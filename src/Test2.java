public class Test2 {

    static synchronized protected final void specialMethod (){

    }

    public static final int A = 5;

    public static void main(String[] args) {

        A a = new A ();
        a.setCounter(124);
        a.print();
    }
}

class A{
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void print(){
        System.out.println("Jestem obiektem klasy A ");
    }
}

class B extends A{
    A a = new A ();
    void test (){
        int i = a.counter;
    }

}
