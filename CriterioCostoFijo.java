public class CriterioCostoFijo extends CriterioCosto {
    private double costoFijo;

    public CriterioCostoFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    @Override
    public double calcularCosto(Seguro seguro) {
        return costoFijo;
    }
}
