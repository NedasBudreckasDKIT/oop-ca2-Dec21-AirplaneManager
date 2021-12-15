package dkit.oop;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
    private int MAX_LOAD_KILOS;
    private int currentLoad;
    String type;
    public CargoAirplane(String type,int MAX_LOAD_KILOS) {
        super(type);
    }

    // constructor

    //getters
    public String getType() {return type;}
    public int getMaxLoad() {return MAX_LOAD_KILOS;}
    public int getCurrentLoad() {return currentLoad;}

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setMaxLoad(int MAX_LOAD_KILOS) {
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }
    public void setCurrentLoad(int currentLoad){this.currentLoad = currentLoad;}
    // toString()
    @Override
    public String toString() {
    return "Airplane Type: "+this.getType() + "\n" +
            "Airplanes Max Load Capacity(KG):" +this.getMaxLoad() +"\n";
//            +"Airplanes Current Load(KG): "+this.getCurrentLoad()+"\n"
    }


} // END of CargoAirplane class.

