/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wordpress.emiliodevesa.java_sql;

import java.util.ArrayList;

/**
 * Cómo acceder a sistemas de BBDD MySQL desde un programa en Java
 * <a href="https://emiliodevesa.wordpress.com/2012/11/16/tutorial-mysql/">Blog
 * post</a>
 *
 * @author Emilio Devesa (http://emiliodevesa.wordpress.com)
 * @version 0.1
 */
public class Programa {

    public static void main(String[] args) {
        BDMgr bdm = new BDMgr();
        ArrayList<Libro> libros;
        System.out.println();

        System.out.println("Mostrar todos los libros");
        libros = bdm.getLibros();
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
        System.out.println();

        System.out.println("Mostrar un libro con ISBN 9788441529373");
        libros = bdm.getLibrosConISBN("9788441529373");
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
        System.out.println();

        System.out.println("Vender ese libro");
        libros = bdm.getLibrosConISBN("9788441529373");
        for (Libro l : libros) {
            bdm.venderLibro(l);
        }
        System.out.println();

        System.out.println("Mostrar todos los libros");
        libros = bdm.getLibros();
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
        System.out.println();
    }

}
