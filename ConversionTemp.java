public class ConversionTemp {
   private double celsius;

   public ConversionTemp(double celsius) {
       this.celsius = celsius;
   }

   public double convertirToFahrenheit() {
       return (9 * celsius + 160) / 5;
   }
}