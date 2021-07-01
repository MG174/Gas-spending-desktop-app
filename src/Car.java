
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
 import java.util.List;


public class Car implements Serializable {
    private String nazwa;
    private List<String> listaID = new ArrayList<String>();
    private String identyfikator;
    private List<String> listaWartosc = new ArrayList<String>();
    private String wartosc;
    private List<String> listaData = new ArrayList<String>();
    private String dataCzas;

    public Car(String nazwa) {
        this.nazwa = nazwa;
    }

    public Car() {
    }

    public List<String> getListaID() {
        return listaID;
    }

    public void setListaID(List<String> listaID) {
        this.listaID = listaID;
    }
    
    public void addListaID(String identyfikator) {
        this.listaID.add(identyfikator);
    }

    public List<String> getListaWartosc() {
        return listaWartosc;
    }

    public void addListaWartosc(String wartosc) {
        this.listaWartosc.add(wartosc);
    }

    public List<String> getListaData() {
        return listaData;
    }

    public void addListaData(String dataCzas) {
        this.listaData.add(dataCzas);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Override
    public String toString(){
        return nazwa;
    }
    
    
}
