import java.util.ArrayList;

public class SeguroIntegrador extends Seguro{

    protected ArrayList<Seguro> seguros;

    public SeguroIntegrador(int poliza, String descripcion, double monto, int dni){
        super(poliza, descripcion, monto, dni);
        this.seguros= new ArrayList<>();
    }

    @Override
    public double getMonto() {
        double suma =0;
        for(Seguro ss:seguros){
            suma += ss.getMonto();
        }
        return suma;
    }

    @Override
    public int getPoliza() {
        int polizamayor = 0;
        for(Seguro ss:seguros){
            int poliza = ss.getPoliza();
            if (poliza > polizamayor){
                polizamayor = poliza;
            }
        }
        return polizamayor;
    }

    @Override
    public double getCosto(CriterioCosto cc) {
        double suma=0;
        for (Seguro ss:seguros){
            suma+= ss.getCosto(cc);
        }
        return suma;
    }
}
