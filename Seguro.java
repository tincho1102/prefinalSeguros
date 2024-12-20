public abstract class Seguro {
    private int poliza;
    private String descripcion;
    private double monto;
    private int dni;

    public Seguro(int poliza, String descripcion, double monto, int dni){
        this.poliza=poliza;
        this.descripcion=descripcion;
        this.monto=monto;
        this.dni=dni;
    }
    public int getPoliza(){return this.poliza;}
    public String getDescripcion(){return this.descripcion;}
    public double getMonto(){return this.monto;}
    public int getDni(){return this.dni;}

    //
    public abstract double getCosto(CriterioCosto cc);


}
