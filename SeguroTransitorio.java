import java.time.LocalDate;

public class SeguroTransitorio extends Seguro{
    private LocalDate inicio;
    private LocalDate fin;
    private Seguro seguroContenido;

    public SeguroTransitorio(int poliza, String descripcion, double monto, int dni, LocalDate inicio, LocalDate fin, Seguro seguroContenido) {
        super(seguroContenido.getPoliza(), descripcion, 0, seguroContenido.getDni());
        this.inicio = inicio;
        this.fin = fin;
        this.seguroContenido = seguroContenido;
    }

    @Override
    public int getPoliza() {
        return seguroContenido.getPoliza();
    }
    public int getDni() {
        return seguroContenido.getDni();
    }

    @Override
    public double getMonto() {
        LocalDate hoy = LocalDate.now();
        if ((inicio.isBefore(hoy) || inicio.isEqual(hoy)) && (fin.isAfter(hoy) || fin.isEqual(hoy))){
            return seguroContenido.getMonto();
        }else return 0.0;
    }

    @Override
    public double getCosto(CriterioCosto cc) {
        LocalDate hoy = LocalDate.now();
        if ((inicio.isAfter(hoy) || inicio.isEqual(hoy)) && (fin.isBefore(hoy) || fin.isEqual(hoy))){
            return seguroContenido.getCosto(cc);
        }else return 0.0;
    }
}

