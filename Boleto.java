/*
 * @author: Diego André Rosales Valenzuela
 * @date: 14/08/2023
 * 
 */

package Eras_Tour;

import java.util.Random;
import java.util.Objects;

public class Boleto {
    //Atributos 
    private int boletosDispo;
    private int Local1;
    private int Local5;
    private int Local10;
    private int a;
    private int b;
    private int c;
    private int cantLocal1;
    private int cantLocal2;
    private int cantLocal3;
    private Random generador;

    public Boleto(){
        boletosDispo = 60;
        Local1=100;
        Local5=500;
        Local10=1000;
        a = 0;
        b = 0;
        c = 0;
        cantLocal1 = 20;
        cantLocal2 = 20;
        cantLocal3 = 20;
        generador = new Random();
    }


    public Boleto(int boletosDispo, int Local1, int Local5, int Local10, int a, int b, int c, int cantLocal1, int cantLocal2, int cantLocal3, Random generador) {
        this.boletosDispo = boletosDispo;
        this.Local1 = Local1;
        this.Local5 = Local5;
        this.Local10 = Local10;
        this.a = a;
        this.b = b;
        this.c = c;
        this.cantLocal1 = cantLocal1;
        this.cantLocal2 = cantLocal2;
        this.cantLocal3 = cantLocal3;
        this.generador = generador;
    }

    public int getBoletosDispo() {
        return this.boletosDispo;
    }

    public void setBoletosDispo(int boletosDispo) {
        this.boletosDispo = boletosDispo;
    }

    public int getLocal1() {
        return this.Local1;
    }

    public void setLocal1(int Local1) {
        this.Local1 = Local1;
    }

    public int getLocal5() {
        return this.Local5;
    }

    public void setLocal5(int Local5) {
        this.Local5 = Local5;
    }

    public int getLocal10() {
        return this.Local10;
    }

    public void setLocal10(int Local10) {
        this.Local10 = Local10;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return this.c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getCantLocal1() {
        return this.cantLocal1;
    }

    public void setCantLocal1(int cantLocal1) {
        this.cantLocal1 = cantLocal1;
    }

    public int getCantLocal2() {
        return this.cantLocal2;
    }

    public void setCantLocal2(int cantLocal2) {
        this.cantLocal2 = cantLocal2;
    }

    public int getCantLocal3() {
        return this.cantLocal3;
    }

    public void setCantLocal3(int cantLocal3) {
        this.cantLocal3 = cantLocal3;
    }

    public Random getGenerador() {
        return this.generador;
    }

    public void setGenerador(Random generador) {
        this.generador = generador;
    }

    public Boleto boletosDispo(int boletosDispo) {
        setBoletosDispo(boletosDispo);
        return this;
    }

    public Boleto Local1(int Local1) {
        setLocal1(Local1);
        return this;
    }

    public Boleto Local5(int Local5) {
        setLocal5(Local5);
        return this;
    }

    public Boleto Local10(int Local10) {
        setLocal10(Local10);
        return this;
    }

    public Boleto a(int a) {
        setA(a);
        return this;
    }

    public Boleto b(int b) {
        setB(b);
        return this;
    }

    public Boleto c(int c) {
        setC(c);
        return this;
    }

    public Boleto cantLocal1(int cantLocal1) {
        setCantLocal1(cantLocal1);
        return this;
    }

    public Boleto cantLocal2(int cantLocal2) {
        setCantLocal2(cantLocal2);
        return this;
    }

    public Boleto cantLocal3(int cantLocal3) {
        setCantLocal3(cantLocal3);
        return this;
    }

    public Boleto generador(Random generador) {
        setGenerador(generador);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Boleto)) {
            return false;
        }
        Boleto boleto = (Boleto) o;
        return boletosDispo == boleto.boletosDispo && Local1 == boleto.Local1 && Local5 == boleto.Local5 && Local10 == boleto.Local10 && a == boleto.a && b == boleto.b && c == boleto.c && cantLocal1 == boleto.cantLocal1 && cantLocal2 == boleto.cantLocal2 && cantLocal3 == boleto.cantLocal3 && Objects.equals(generador, boleto.generador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boletosDispo, Local1, Local5, Local10, a, b, c, cantLocal1, cantLocal2, cantLocal3, generador);
    }

    @Override
    public String toString() {
        return "{" +
            " boletosDispo='" + getBoletosDispo() + "'" +
            ", Local1='" + getLocal1() + "'" +
            ", Local5='" + getLocal5() + "'" +
            ", Local10='" + getLocal10() + "'" +
            ", a='" + getA() + "'" +
            ", b='" + getB() + "'" +
            ", c='" + getC() + "'" +
            ", cantLocal1='" + getCantLocal1() + "'" +
            ", cantLocal2='" + getCantLocal2() + "'" +
            ", cantLocal3='" + getCantLocal3() + "'" +
            ", generador='" + getGenerador() + "'" +
            "}";
    }

    public int generadorRandom(){
        return generador.nextInt(15000)+1;
    }

    public int generadorLocal(){
        return generador.nextInt(3)+1;
    }

    public boolean comparadorBoleto(int c, int a, int b){
        if (c>=a && c<=b || c<=a && c>=b){
            return true;
        }else{
            return false;
        }
    }

    public void comprarBoleto(Comprador comprador){
        c = generadorRandom();  //Número de solicitud
        a = generadorRandom();  //Comparador 1
        b = generadorRandom();  //Comparador 2
        
        boolean comparador = comparadorBoleto(c, a, b);
        if (comparador){
            int localidad = generadorLocal();
            switch (localidad) {
                case 1:
                    if (cantLocal1!=0){
                        if (comprador.getCantBoletos()<cantLocal1){
                            if (comprador.getSaldoMax()>Local1){
                                cantLocal1 = cantLocal1-comprador.getCantBoletos();
                                comprador.setSaldoMax(comprador.getSaldoMax()-Local1);
                                System.out.println("Se generó su ticket exitosamente");
                            }else{
                                System.out.println("--------------------------------");
                                System.out.println("No hay saldo suficiente");
                            }
                        }else{
                            System.out.println("--------------------------------");
                            System.out.println("No hay suficientes boletos disponibles ");
                        }
                    }else{
                        System.out.println("--------------------------------");
                        System.out.println("No hay cupos disponibles");
                    }
                    break;
                case 2:
                    if (cantLocal2!=0){
                        if (comprador.getCantBoletos()<cantLocal2){
                            if (comprador.getSaldoMax()>Local5){
                                cantLocal2 = cantLocal2-comprador.getCantBoletos();
                                comprador.setSaldoMax(comprador.getSaldoMax()-Local5);
                                System.out.println("Se generó su ticket exitosamente");
                            }else{
                                System.out.println("--------------------------------");
                                System.out.println("No hay saldo suficiente");
                            }
                        }else{
                            System.out.println("--------------------------------");
                            System.out.println("No hay suficientes boletos disponibles ");
                        }
                    }else{
                        System.out.println("--------------------------------");
                        System.out.println("No hay cupos disponibles");
                    }
                    break;
                case 3:
                    if (cantLocal1!=0){
                        if (comprador.getCantBoletos()<cantLocal3){
                            if (comprador.getSaldoMax()>Local10){
                                cantLocal3 = cantLocal3-comprador.getCantBoletos();
                                comprador.setSaldoMax(comprador.getSaldoMax()-Local10);
                                System.out.println("Se generó su ticket exitosamente");
                            }else{
                                System.out.println("--------------------------------");
                                System.out.println("No hay saldo suficiente");
                            }
                        }else{
                            System.out.println("--------------------------------");
                            System.out.println("No hay suficientes boletos disponibles ");
                        }
                    }else{
                        System.out.println("--------------------------------");
                        System.out.println("No hay cupos disponibles");
                    }
                    break;
            }
            

        }else{
            System.out.println("--------------------------------");
            System.out.println("No fue posible generar un ticket");
            System.out.println("--------------------------------");
        }
    }
    
    public void consultaTotal(Comprador comprador){
        System.out.println("--- Boletos vendidos segun localidad ---- ");
        System.out.println("Localidad 1:  \n"+(20-cantLocal1));
        System.out.println("Localidad 2:  \n"+(20-cantLocal2));
        System.out.println("Localidad 3:  \n"+(20-cantLocal3));
        System.out.println("--------------------------------");
        
        System.out.println("--- Boletos disponibles segun localidad ---- ");
        System.out.println("Localidad 1:  \n"+(cantLocal1));
        System.out.println("Localidad 2:  \n"+(cantLocal2));
        System.out.println("Localidad 3:  \n"+(cantLocal3));
        System.out.println("--------------------------------");
    }

    public void consultaIndividual(Comprador comprador, int localidad){
        switch (localidad) {
            case 1:
                System.out.println("--- Boletos disponibles segun localidad ---- ");
                System.out.println("Localidad 1:  \n"+(cantLocal1));
                break;
            case 2:
                System.out.println("--- Boletos disponibles segun localidad ---- ");
                System.out.println("Localidad 2:  \n"+(cantLocal2));
                break;
            case 3:
                System.out.println("--- Boletos disponibles segun localidad ---- ");
                System.out.println("Localidad 3:  \n"+(cantLocal3));
                break;
        }
    }

}
