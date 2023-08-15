/*
 * @author: Diego André Rosales Valenzuela
 * @date: 14/08/2023
 * 
 */

package Eras_Tour;
import java.util.Objects;

public class Comprador {
    //Atributos
    private String Nombre;
    private String Email;
    private int cantBoletos;
    private int saldoMax;


    public Comprador(String Nombre, String Email, int cantBoletos, int saldoMax) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.cantBoletos = cantBoletos;
        this.saldoMax = saldoMax;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCantBoletos() {
        return this.cantBoletos;
    }

    public void setCantBoletos(int cantBoletos) {
        this.cantBoletos = cantBoletos;
    }

    public int getSaldoMax() {
        return this.saldoMax;
    }

    public void setSaldoMax(int saldoMax) {
        this.saldoMax = saldoMax;
    }

    public Comprador Nombre(String Nombre) {
        setNombre(Nombre);
        return this;
    }

    public Comprador Email(String Email) {
        setEmail(Email);
        return this;
    }

    public Comprador cantBoletos(int cantBoletos) {
        setCantBoletos(cantBoletos);
        return this;
    }

    public Comprador saldoMax(int saldoMax) {
        setSaldoMax(saldoMax);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comprador)) {
            return false;
        }
        Comprador comprador = (Comprador) o;
        return Objects.equals(Nombre, comprador.Nombre) && Objects.equals(Email, comprador.Email) && cantBoletos == comprador.cantBoletos && saldoMax == comprador.saldoMax;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Email, cantBoletos, saldoMax);
    }

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Email='" + getEmail() + "'" +
            ", cantBoletos='" + getCantBoletos() + "'" +
            ", saldoMax='" + getSaldoMax() + "'" +
            "}";
    }
    






}
