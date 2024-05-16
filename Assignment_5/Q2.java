class Q2 {
    private String name;

    public Q2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Q2 obj1 = new Q2("Object1");
        Q2 obj2 = new Q2("Object2");

        obj1 = obj2;
        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
}