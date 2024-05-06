public class Estudiante {
   private String name;
   private int age;
   private int score;

   public Estudiante(String name, int age, int score) {
       this.name = name;
       setAge(age);
       setScores(score);
   }

   public void setAge(int age) {
       if (age < 0) {
           System.out.println("Edad inválida, estableciendo edad a 0.");
           this.age = 0;
       } else {
           this.age = age;
       }
   }

   public void setScores(int score) {
       if (score < 0) {
           System.out.println("Calificación inválida, estableciendo calificación a 0.");
           this.score = 0;
       } else {
           this.score = score;
       }
   }

   public void printStudentInfo() {
       System.out.println("Nombre: " + name);
       System.out.println("Edad: " + age);
       System.out.println("Calificación: " + score);
   }
}