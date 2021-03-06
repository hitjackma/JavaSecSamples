
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteRMIServer {
    private void start() throws Exception {
        if (System.getSecurityManager() == null) {
            System.out.println("setup SecurityManager");
            System.setSecurityManager(new SecurityManager());
        }

        Calc h = new Calc();
        LocateRegistry.createRegistry(1099);
        //Naming.rebind("rmi://192.168.1.107:1099/refObj", h);
        Naming.rebind("refObj", h);
    }

    public static void main(String[] args) throws Exception {
        new RemoteRMIServer().start();
    }
}
