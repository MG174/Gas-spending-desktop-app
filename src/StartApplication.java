
import java.io.IOException;


public class StartApplication {

    public static void main(String[] args) {
        Saver saver = new Saver();
        BundleGarage bundleGarage = null;
        try{
        bundleGarage = saver.read();
        }
        catch (IOException e){
            System.out.println("Błąd odczytu.");
            bundleGarage = new BundleGarage();
        }
        catch (ClassNotFoundException e){ 
            System.out.println("Błąd odczytu.");
            bundleGarage = new BundleGarage();
        }
        finally {
        User user = new User();
        user.setBundleGarage(bundleGarage);
        user.loader();
        }
  
        
        
}
}
