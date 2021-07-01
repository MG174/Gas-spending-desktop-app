
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class BundleGarage implements Serializable {
    private List<Garage> listaGarage = new ArrayList<Garage>();

    public List<Garage> getListaGarage() {
        return listaGarage;
    }

    public void setListaGarage(List<Garage> listaGarage) {
        this.listaGarage = listaGarage;
    }
    
    public void addGarageToBundleGarage(Garage garage){
        listaGarage.add(garage);
    }
    
}
