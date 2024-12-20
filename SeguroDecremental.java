import java.time.LocalDate;

public class SeguroDecremental extends Seguro{
    private LocalDate año;
    public SeguroDecremental(int poliza, String descripcion, double monto, int dni, LocalDate año){
        super(poliza, descripcion, monto, dni);
        this.año=año;
    }

    @Override
    public double getMonto() {
        LocalDate hoy = LocalDate.now();
        double diferencia = hoy.getYear() - año.getYear();
        double monto = this.getMonto() / diferencia;
        return monto;
    }

    public double getCosto(CriterioCosto cc){
        return cc.calcularCosto(this);
    }
}
