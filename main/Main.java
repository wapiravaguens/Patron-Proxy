/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main( String[] args )
    {
        // Abrimos un documento que puede contener una sola imagen
        Documento doc = new Documento( "Presupuesto.doc");
        try     // Necesario al usar Thread
        {
            // Pausamos la ejecución del programa durante 3 segundos
            Thread.sleep( 3000 );
            // Simulamos que el usuario hace scroll
             doc.hacerScroll();
        }
        catch( Exception e )
        {
            System.out.println("Ha ocurrido un error");
        }
    }
    
}
