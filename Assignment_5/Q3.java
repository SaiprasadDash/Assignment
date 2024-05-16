class Q3 {
    private String name;

    public Q3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Q3 obj = new Q3("MyObject");
        Q3 reference = obj;
        obj = null;
        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
}
