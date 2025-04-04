package ite.kubak.model;

public class TankerListener {
    Tanker tanker = new Tanker();

    public boolean start(int max_value, String host, int port, String sewage_host, int sewage_port, int office_port){
        if(tanker.test_connection(sewage_host,sewage_port,office_port)){
            tanker.start(max_value, host, port, sewage_host, sewage_port, office_port);
            return true;
        }
        else return false;
    }

    public void register(){
        tanker.register_to_office();
    }

    public void set_readiness(){
        tanker.set_readiness();
    }

    public boolean getWay(){
        return tanker.getWay();
    }

    public void use_sewage_plant(){
        tanker.useSewagePlant();
    }

    public double getProgress(){
        return (double) tanker.getVolume() / tanker.getMax_volume();
    }

    public boolean getReady(){
        return tanker.getReady();
    }
}
