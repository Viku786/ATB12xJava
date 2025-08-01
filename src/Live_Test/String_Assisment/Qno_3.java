package Live_Test.String_Assisment;

public class Qno_3 {
    public static void main(String[] args) {
        int iterations = 1000;

        // Test String (+ operator, immutable)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");

        // Test StringBuilder (faster, non-synchronized)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");

        // Test StringBuffer (thread-safe, synchronized)
        startTime = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");
    }
}
