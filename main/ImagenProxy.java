/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class ImagenProxy implements Imagen
{
     private ImagenReal imagen = null;
     private String nombreImagen = "";
    // ---------------------------
    public ImagenProxy( String nombreImagen )
    {
        this.nombreImagen = nombreImagen;
    }
    // ---------------------------
    @Override
     public void mostrarImagen()
    {
        if(this.imagen == null)
        {
            this.imagen = new ImagenReal( nombreImagen );
        }
        this.imagen.mostrarImagen();
    }
}