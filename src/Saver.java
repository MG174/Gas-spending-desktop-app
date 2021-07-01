
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goryc
 */
public class Saver {
    
    public void save(BundleGarage bundleGarage) throws FileNotFoundException, IOException{
        //fileoutput   
        FileOutputStream FO = new FileOutputStream("bundle_garage_zapis.txt");
        //objectoutput
        ObjectOutputStream OO = new ObjectOutputStream(FO);
        //savebank
        OO.writeObject(bundleGarage);
        OO.close();
    }
    //odczytywanie
    public BundleGarage read() throws IOException, ClassNotFoundException {
         //fileinput
         FileInputStream FI = new FileInputStream("bundle_garage_zapis.txt");
         //objectinput
         ObjectInputStream OI = new ObjectInputStream(FI);
         //returningbank
         return (BundleGarage) OI.readObject();
}
}
