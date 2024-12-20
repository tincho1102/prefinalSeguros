public class SeguroAutomotor extends Seguro{
    public SeguroAutomotor(int poliza, String descripcion, double monto, int dni){
        super(poliza, descripcion, monto, dni);
    }

    @Override
    public double getCosto(CriterioCosto cc) {
        return cc.calcularCosto(this);
    }
}
