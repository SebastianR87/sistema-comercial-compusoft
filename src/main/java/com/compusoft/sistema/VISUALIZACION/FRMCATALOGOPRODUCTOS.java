/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.compusoft.sistema.VISUALIZACION;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FRMCATALOGOPRODUCTOS extends javax.swing.JFrame {

    // Componentes del layout
    private JPanel panelEncabezado;
    private JPanel panelCuerpo;
    private JPanel panelFiltros;
    private javax.swing.JScrollPane scrollCatalogo;
    private JPanel panelCuadricula;

    public FRMCATALOGOPRODUCTOS() {
        initComponentsManual();
        cargarProductosSimulados();
        this.setSize(1000, 750);
        this.setLocationRelativeTo(null);
    }

    private void initComponentsManual() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catálogo de Productos - Prototipo");
        getContentPane().setLayout(new java.awt.BorderLayout());

        // 1. Configuración del Encabezado (Estilo banner superior)
        panelEncabezado = new JPanel();
        panelEncabezado.setBackground(new Color(139, 0, 0)); // Rojo oscuro base
        panelEncabezado.setPreferredSize(new Dimension(1000, 100));
        panelEncabezado.setLayout(new BoxLayout(panelEncabezado, BoxLayout.Y_AXIS));

        JLabel lblTitulo = new JLabel("Catálogo de Componentes de PC");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel lblSubtitulo = new JLabel("Busca, compara y encuentra los componentes ideales para tu nueva bestia del gaming.");
        lblSubtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblSubtitulo.setForeground(new Color(220, 220, 220));
        lblSubtitulo.setAlignmentX(CENTER_ALIGNMENT);

        panelEncabezado.add(BoxHorizontalVerticalFix(15)); // Espaciador
        panelEncabezado.add(lblTitulo);
        panelEncabezado.add(BoxHorizontalVerticalFix(5));
        panelEncabezado.add(lblSubtitulo);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        // 2. Panel Cuerpo Principal
        panelCuerpo = new JPanel(new java.awt.BorderLayout());
        panelCuerpo.setBackground(new Color(24, 24, 28));

        // 3. Panel Lateral de Filtros (Izquierda)
        panelFiltros = new JPanel();
        panelFiltros.setBackground(new Color(35, 35, 45));
        panelFiltros.setPreferredSize(new Dimension(240, 650));
        panelFiltros.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelFiltros.setLayout(new BoxLayout(panelFiltros, BoxLayout.Y_AXIS));

        JLabel lblFiltroTitulo = new JLabel("Categorías");
        lblFiltroTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblFiltroTitulo.setForeground(Color.WHITE);
        panelFiltros.add(lblFiltroTitulo);
        panelFiltros.add(BoxHorizontalVerticalFix(15));

        String[] categorias = {"Procesadores", "Tarjetas de Video", "Memorias RAM", "Discos Almacenamiento", "Fuentes de Poder"};
        for (String cat : categorias) {
            JCheckBox chk = new JCheckBox(cat);
            chk.setForeground(Color.LIGHT_GRAY);
            chk.setBackground(new Color(35, 35, 45));
            chk.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panelFiltros.add(chk);
            panelFiltros.add(BoxHorizontalVerticalFix(8));
        }

        panelCuerpo.add(panelFiltros, java.awt.BorderLayout.WEST);

        // 4. Cuadrícula de Productos (Derecha con Scroll)
        // El GridLayout define: 0 filas (dinámicas), 3 columnas, 15px de espacio horizontal y vertical
        panelCuadricula = new JPanel(new GridLayout(0, 3, 15, 15));
        panelCuadricula.setBackground(new Color(24, 24, 28));
        panelCuadricula.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        scrollCatalogo = new javax.swing.JScrollPane(panelCuadricula);
        scrollCatalogo.setBorder(null);
        scrollCatalogo.getVerticalScrollBar().setUnitIncrement(16); // Scroll suave

        panelCuerpo.add(scrollCatalogo, java.awt.BorderLayout.CENTER);
        getContentPane().add(panelCuerpo, java.awt.BorderLayout.CENTER);
    }

    // Generador auxiliar de espaciado invisible
    private java.awt.Component BoxHorizontalVerticalFix(int size) {
        return javax.swing.Box.createRigidArea(new Dimension(0, size));
    }

    // 5. Método para inflar las tarjetas visuales (Simulación del catálogo)
    private void cargarProductosSimulados() {
        // Estructura de prueba: {Nombre, Precio, Descuento}
        String[][] itemsHardware = {
            {"Intel Core i9-14900K", "S/. 2,450.00", "-10%"},
            {"AMD Ryzen 7 7800X3D", "S/. 1,890.00", "-15%"},
            {"NVIDIA RTX 4070 Ti Super", "S/. 3,850.00", "-5%"},
            {"Corsair Vengeance 32GB RAM", "S/. 420.00", "-20%"},
            {"Kingston NV2 1TB NVMe SSD", "S/. 280.00", "-12%"},
            {"ASUS ROG Thor 1000W", "S/. 1,150.00", "-8%"}
        };

        for (String[] prod : itemsHardware) {
            panelCuadricula.add(crearTarjetaComponente(prod[0], prod[1], prod[2]));
        }
    }

    // 6. Constructor dinámico de la celda de cada producto (Tarjeta visual)
    private JPanel crearTarjetaComponente(String nombre, String precio, String descuento) {
        JPanel tarjeta = new JPanel();
        tarjeta.setBackground(new Color(40, 40, 50));
        tarjeta.setLayout(new BoxLayout(tarjeta, BoxLayout.Y_AXIS));
        tarjeta.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Etiqueta de oferta (Esquina superior)
        JLabel lblDescuento = new JLabel(descuento + " OFF ");
        lblDescuento.setOpaque(true);
        lblDescuento.setBackground(new Color(220, 20, 60)); // Color carmesí
        lblDescuento.setForeground(Color.WHITE);
        lblDescuento.setFont(new Font("Segoe UI", Font.BOLD, 11));
        lblDescuento.setAlignmentX(LEFT_ALIGNMENT);

        // Representación visual de la imagen (Rectángulo temporal oscuro)
        JPanel placeholderImagen = new JPanel(new java.awt.BorderLayout());
        placeholderImagen.setBackground(new Color(55, 55, 65));
        placeholderImagen.setPreferredSize(new Dimension(180, 140));
        placeholderImagen.setMaximumSize(new Dimension(300, 140));
        
        JLabel lblImgTexto = new JLabel("[ Imagen Hardware ]", SwingConstants.CENTER);
        lblImgTexto.setForeground(Color.GRAY);
        placeholderImagen.add(lblImgTexto, java.awt.BorderLayout.CENTER);

        // Detalles del texto descriptivo
        JLabel lblNombre = new JLabel(nombre);
        lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblNombre.setForeground(Color.WHITE);
        lblNombre.setAlignmentX(LEFT_ALIGNMENT);

        JLabel lblPrecio = new JLabel(precio);
        lblPrecio.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblPrecio.setForeground(new Color(50, 205, 50)); // Verde lima brillante
        lblPrecio.setAlignmentX(LEFT_ALIGNMENT);

        // Botón de acción rápido
        JButton btnVer = new JButton("Ver Detalles");
        btnVer.setBackground(Color.WHITE);
        btnVer.setForeground(Color.BLACK);
        btnVer.setFocusPainted(false);
        btnVer.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnVer.setAlignmentX(LEFT_ALIGNMENT);

        // Ensamblado estructurado de la celda del producto
        tarjeta.add(lblDescuento);
        tarjeta.add(BoxHorizontalVerticalFix(10));
        tarjeta.add(placeholderImagen);
        tarjeta.add(BoxHorizontalVerticalFix(12));
        tarjeta.add(lblNombre);
        tarjeta.add(BoxHorizontalVerticalFix(6));
        tarjeta.add(lblPrecio);
        tarjeta.add(BoxHorizontalVerticalFix(12));
        tarjeta.add(btnVer);

        return tarjeta;
    }
   /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
¨*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FRMCATALOGOPRODUCTOS().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
