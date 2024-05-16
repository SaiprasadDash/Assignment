class Q1 {
    private String name;

    public Q1(String name) {
        this.name = name;
    }

    public void show() {
        Q1 obj = new Q1("InnerObject");
        obj.display();
    }

    public void display() {

        Q1 innerObj = new Q1("InnerInnerObject");

        System.out.println("Inner object name: " + innerObj.name);
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        Q1 outerObj = new Q1("OuterObject");
        outerObj.show();
        System.gc();
    }
}
