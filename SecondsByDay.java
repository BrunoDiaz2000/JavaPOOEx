public class SecondsByDay {
   private int dias;

   public SecondsByDay(int dias) {
       this.dias = dias;
   }

   public int calcularSegundos() {
       return dias * 24 * 60 * 60;
   }
}