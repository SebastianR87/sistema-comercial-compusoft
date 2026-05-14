/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compusoft.sistema;

import com.compusoft.sistema.VISUALIZACION.FRMMENUINICIAL;

public class SistemaComercialCompusoft {

    public static void main(String[] args) {
        // Inicializa el hilo de despacho de eventos de la GUI de Swing de forma segura
        java.awt.EventQueue.invokeLater(() -> {
            FRMMENUINICIAL ventanaInicial = new FRMMENUINICIAL();
            ventanaInicial.setLocationRelativeTo(null); // Despliega centrado
            ventanaInicial.setVisible(true); // Arranca la ejecución visual
        });
    }
}