/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.fecha;

import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroCardozo
 */
public class Fechas {
   public static void main(String[] args) {
        int dd = 0, mm = 0, aa = 0;
        Fecha F = new Fecha();
        do {
            dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite día"));
            mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mes"));
            do {
                aa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite año desde 1963"));

            } while (aa<1963);
            try {
               F.comprobar(dd, mm, aa);
            } catch (ExceptoFecha e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                dd=mm=aa=0;
            }
        } while (dd==0  && mm==0 && aa==0);
        System.exit(0);
    }
}
