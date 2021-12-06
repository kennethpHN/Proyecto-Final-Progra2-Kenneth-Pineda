/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Util.AdminArchivos;
import Util.AdminSerializacion;
import clases.HoraAbordaje;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pinedas
 */
public class FrmHoraAbordaje extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmHoraAbordaje
     */
    private boolean _agregando;
    private int _indiceSeleccion;

    public FrmHoraAbordaje() {
        initComponents();
        this.setTitle("Gestión de Hora de Abordaje");
        actualizarElementosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtHoraAbordaje = new javax.swing.JTable();

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion:");

        jLabel8.setText("Codigo:");

        txtCodigo.setEditable(false);

        txtDescripcion.setEditable(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jtHoraAbordaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtHoraAbordaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtHoraAbordajeMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtHoraAbordaje);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel3))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardar)))
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReporte)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnEditar)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this._agregando = true;

        estadoBotones(false);
        estadoControles(true);
        //this.txtCodigo.setEditable(true);
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this._agregando = false;
        estadoBotones(false);
        estadoControles(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        AdminArchivos adminA = new AdminArchivos();
        adminA.setNombreArchivo("Reporte Ciudad de HoraAbordaje.csv");
        adminA.setContenido(MDIPrincipal.gHora.getInfoReporte());
        adminA.escribir();
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, "Reporte generado correctamente");

    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        /**
         * 1. Solicitar valores 2. Crear instancia 3. Setear valores a instancia
         * 4. Agregar instancia a la gestion 5. Mostrar valores
         */

        //Paso 1
        String codigo, descripcion;
        codigo = this.txtCodigo.getText();
        descripcion = this.txtDescripcion.getText();
        //Paso 2
        HoraAbordaje horaAbordaje = new HoraAbordaje();

        try {
            //Paso 3
            //origen.set_codigo(Integer.parseInt(codigo));
            horaAbordaje.set_descripcion(descripcion);
            if (this._agregando) { // agregara
                /**
                 * 4. Agregar instancia a la gestion
                 */

                //Paso 4
                MDIPrincipal.gHora.Agregar(horaAbordaje);

            } else { // editara o modificara
                /**
                 * 4. Editar instancia en la gestion
                 */
                //Paso 1.1
                codigo = this.txtCodigo.getText();
                //Paso 3.1
                horaAbordaje.set_codigo(Integer.parseInt(codigo));

                //Paso 4
                MDIPrincipal.gHora.Modificar(this._indiceSeleccion, horaAbordaje);
            }
            //Paso 5
            actualizarElementosTabla();
            estadoBotones(true);
            estadoControles(false);

            //Paso 6: Serializar informacion
            AdminSerializacion.serializacion(MDIPrincipal.gHora, "gHora.obj");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String _codigoHoraAbordaje = JOptionPane.showInputDialog("Ingrese el código");
        HoraAbordaje _horaAbordajeEncontrado = MDIPrincipal.gHora.BuscarPorCodigoGetElem(Integer.parseInt(_codigoHoraAbordaje));
        if (_horaAbordajeEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Elemento no encontrado");
        } else {
            mostrarElemento(_horaAbordajeEncontrado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (_indiceSeleccion >= 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                MDIPrincipal.gHora.Eliminar(_indiceSeleccion);
                actualizarElementosTabla();
                //Paso 6: Serializar informacion
                AdminSerializacion.serializacion(MDIPrincipal.gHora, "gHora.obj");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor seleccione el elemento de la tabla que desea eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void jtHoraAbordajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHoraAbordajeMousePressed
        // TODO add your handling code here:
        _indiceSeleccion = jtHoraAbordaje.getSelectedRow();
        if (_indiceSeleccion != -1) {
            HoraAbordaje _horaAbordaje = MDIPrincipal.gHora.getElementoPorPosicion(_indiceSeleccion);
            mostrarElemento(_horaAbordaje);
        }
    }//GEN-LAST:event_jtHoraAbordajeMousePressed

    public void estadoControles(boolean _estado) {
        this.txtDescripcion.setEditable(_estado);
    }

    public void estadoBotones(boolean _estado) {
        this.btnBuscar.setEnabled(_estado);
        this.btnEditar.setEnabled(_estado);
        this.btnEliminar.setEnabled(_estado);
        this.btnGuardar.setEnabled(!_estado);
        this.btnNuevo.setEnabled(_estado);
        this.btnSalir.setEnabled(_estado);
        this.btnReporte.setEnabled(_estado);
    }

    public void mostrarElemento(HoraAbordaje _horaAbordaje) {
        this.txtCodigo.setText(Integer.toString(_horaAbordaje.get_codigo()));
        this.txtDescripcion.setText(_horaAbordaje.get_descripcion());
    }

    public void actualizarElementosTabla() {
        // String codigo, dni, nombre, apellido
        String[] titulos = {"Código", "Descripción"};
        DefaultTableModel dt = new DefaultTableModel(MDIPrincipal.gHora.GetArrayGestion(), titulos);
        this.jtHoraAbordaje.setModel(dt);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtHoraAbordaje;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
