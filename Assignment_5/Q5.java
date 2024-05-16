class Q5 {
    private int intValue;
    private double doubleValue;

    public Q5(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public static void main(String[] args) {

        Q5 obj1 = new Q5(10, 3.14);
        Q5 obj2 = new Q5(20, 6.28);

        obj1 = null;
        System.gc();
        
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total memory: " + totalMemory + " bytes");
        System.out.println("Used memory: " + usedMemory + " bytes");
    }
}
