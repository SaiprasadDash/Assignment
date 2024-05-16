import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();

        int numObjects = 1_000_000;
        for (int i = 0; i < numObjects; i++) {
            objectList.add(new Object());
        }

        long timestamp = System.currentTimeMillis();
        System.out.println("Timestamp: " + timestamp);
        
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Heap size (total memory): " + totalMemory + " bytes");
        System.out.println("Used memory: " + usedMemory + " bytes");
        System.out.println("Free memory: " + freeMemory + " bytes");
    }
}
