public class CostoAuto {
   private double costo;

   public CostoAuto(double costo) {
       this.costo = costo;
   }

   public double calcularCostoFinal() {
       double porcentajeGanancia = 0.12;
       double impuestos = 0.06;

       return costo * (1 + porcentajeGanancia) * (1 + impuestos);
   }
}