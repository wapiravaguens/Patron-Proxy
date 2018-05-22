/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class ImagenReal implements Imagen
{
    private String nombre;
    // ---------------------------
    public ImagenReal( String nombre )
    {
        this.nombre = nombre;
    }
    // ---------------------------
    @Override
     public void mostrarImagen()
    {
        System.out.println("Mostrando imagen: [" + nombre + "]" );
    }
}
