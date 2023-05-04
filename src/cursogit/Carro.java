/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursogit;

/**
 *
 * @author oscar
 */
public class Carro
{
    private int numRuedas;
    private String color;
    private String marca;
    private String modelo;

    public Carro()
    {
    }

    public Carro(int numRuedas, String color, String marca, String modelo)
    {
        this.numRuedas = numRuedas;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return the numRuedas
     */
    public int getNumRuedas()
    {
        return numRuedas;
    }

    /**
     * @param numRuedas the numRuedas to set
     */
    public void setNumRuedas(int numRuedas)
    {
        this.numRuedas = numRuedas;
    }

    /**
     * @return the color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    
}
