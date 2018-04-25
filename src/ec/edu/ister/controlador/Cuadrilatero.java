/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

/**
 *
 * @author SANTIAGO27
 */
public class Cuadrilatero {
    //atributos 
    private float lado1;
    private float lado2;
    //metodos 
//metodo constructor uno que sea cuadrilatero 
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//metodo constructor dos :en el caso del cuadrado 
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2=lado1;
    }
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2); 
        return perimetro;
    }
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
}
