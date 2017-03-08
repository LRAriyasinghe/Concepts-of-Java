class Counter {
    private int c;
    public Counter(){
      c=0;
    }
    public void increment() {
        c++;
    }
    public void decrement() {
        c--;
    }
    public void reset() {
        c=0;
    }
    public void print() {
        System.out.println(c);
    }

}
