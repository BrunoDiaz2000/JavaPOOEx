// Password.java
public class Password {
    private String password;
    private boolean isStrong;

    public Password(String password) {
        this.password = password;
        this.isStrong = checkStrength();
    }

    private boolean checkStrength() {
        // Implementa la lógica para determinar si el password es fuerte o no
        // Puedes usar tus propios criterios aquí
        return password.length() >= 8;
    }

    public String getPassword() {
        return password;
    }

    public boolean isStrong() {
        return isStrong;
    }
}