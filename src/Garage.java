
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Garage implements Serializable {
    private String imieUser;
    private List<Car> listaSamochodow = new ArrayList<Car>();
    
    public void addSamochod(Car samochod){
        listaSamochodow.add(samochod);
    }

    public Garage(String imieUser) {
        this.imieUser = imieUser;
    }
    
    public Garage() {
    }

    public String getImieUser() {
        return imieUser;
    }

    public void setImieUser(String imieUser) {
        this.imieUser = imieUser;
    }

    public List<Car> getListaSamochodow() {
        return listaSamochodow;
    }

    public void setListaSamochodow(List<Car> listaSamochodow) {
        this.listaSamochodow = listaSamochodow;
    }
    
    @Override
    public String toString(){
        return imieUser;
    }
    
    
}
