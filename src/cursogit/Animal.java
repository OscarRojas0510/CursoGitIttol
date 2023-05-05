/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursogit;

/**
 *
 * @author oscar
 */
public class Animal
{
    private String especie;
    private String nombre;
    private double peso;
    private byte edad;

    public Animal()
    {
    }

    public Animal(String especie, String nombre, double peso, byte edad)
    {
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    /**
     * @return the especie
     */
    public String getEspecie()
    {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie)
    {
        this.especie = especie;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public double getPeso()
    {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    /**
     * @return the edad
     */
    public byte getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(byte edad)
    {
        this.edad = edad;
    }
    
}
