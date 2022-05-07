


package restauranteapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian
 */
public class Interfaz extends javax.swing.JFrame {
     
     //ATRIBUTOS
    private ArrayList<Producto> plato      = new ArrayList();
    private ArrayList<Cliente> Lclientes   = new ArrayList();
    private ArrayList<Reserva> reservaList = new ArrayList();
    private ArrayList<Pedido> pedidoList   = new ArrayList();
    
    //CONSTANTES
    private int NUM_MESAS = 10;
    
    public Interfaz() {
        initComponents();
        try {
            cargarDatos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mesaReservaBox = new javax.swing.JSpinner();
        reservaHoraBox = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        nombreClienteBoxReserva = new javax.swing.JTextField();
        reservaBoton = new javax.swing.JButton();
        reservaBotonVer = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IdreservaBox = new javax.swing.JSpinner();
        reservasEditarBoton = new javax.swing.JButton();
        reservasEliminarBoton = new javax.swing.JButton();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        btnReservaBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buscarProductoBox = new javax.swing.JTextField();
        BuscarBotonPedidos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pedidoNombreVistaBox = new javax.swing.JTextField();
        pedidoCantidadBox = new javax.swing.JSpinner();
        pedidoMesaBox = new javax.swing.JSpinner();
        pedidoCargarBoton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        spnMesa = new javax.swing.JSpinner();
        pedidoFacturarBoton = new javax.swing.JButton();
        pedidoPagoRecibidoBoton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        menuNombreProductoBox = new javax.swing.JTextField();
        menuTipoProductoBox = new javax.swing.JTextField();
        menuDisponibilidadBox = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        menuBotonCrearPlato = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        menuBuscarProducto = new javax.swing.JTextField();
        btnMenuBuscar = new javax.swing.JButton();
        menuEliminarBoton = new javax.swing.JButton();
        imprimirBotonMenu = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        menuPrecioProducto = new javax.swing.JTextField();
        menuEditarBoton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clienteBoxNombre = new javax.swing.JTextField();
        clienteBoxCedula = new javax.swing.JTextField();
        clienteBoxTelefono = new javax.swing.JTextField();
        clienteBotonCrear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        chxIsPreferencial = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnClienteEditar = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pantalla = new javax.swing.JTextArea();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(244, 208, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(255, 233, 233));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurante");
        jLabel1.setOpaque(true);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel3.setBackground(new java.awt.Color(255, 155, 155));

        jLabel2.setText("Crear reserva");

        jLabel3.setText("NOMBRE DEL CLIENTE:");

        jLabel4.setText("FECHA DE LA RESERVA:");

        jLabel21.setText("MESA:");

        mesaReservaBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        reservaHoraBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jLabel22.setText("HORA:");

        reservaBoton.setText("RESERVAR");
        reservaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaBotonActionPerformed(evt);
            }
        });

        reservaBotonVer.setText("VER RESERVAS");
        reservaBotonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaBotonVerActionPerformed(evt);
            }
        });

        jLabel23.setText("Editar Reserva");

        jLabel24.setText("Id Reserva:");

        reservasEditarBoton.setText("EDITAR");
        reservasEditarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasEditarBotonActionPerformed(evt);
            }
        });

        reservasEliminarBoton.setText("ELIMINAR");
        reservasEliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasEliminarBotonActionPerformed(evt);
            }
        });

        btnReservaBuscar.setText("BUSCAR");
        btnReservaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel23)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(2, 2, 2))
                                            .addComponent(nombreClienteBoxReserva))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesaReservaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(reservaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 25, Short.MAX_VALUE)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(reservaHoraBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(reservaBotonVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdreservaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(btnReservaBuscar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reservasEditarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservasEliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombreClienteBoxReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reservaHoraBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(mesaReservaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservaBoton)
                    .addComponent(reservaBotonVer))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdreservaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReservaBuscar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservasEditarBoton)
                    .addComponent(reservasEliminarBoton))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RESERVAS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 155, 155));

        jLabel15.setText("Cargar pedido");

        jLabel16.setText("Nombre del producto:");

        BuscarBotonPedidos.setText("BUSCAR");
        BuscarBotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBotonPedidosActionPerformed(evt);
            }
        });

        jLabel17.setText("NOMBRE:");

        jLabel18.setText("CANTIDAD:");

        jLabel19.setText("MESA:");

        pedidoNombreVistaBox.setEditable(false);
        pedidoNombreVistaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoNombreVistaBoxActionPerformed(evt);
            }
        });

        pedidoCantidadBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99000, 1));

        pedidoMesaBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, 123, 1));

        pedidoCargarBoton.setText("CARGAR");
        pedidoCargarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoCargarBotonActionPerformed(evt);
            }
        });

        jLabel20.setText("MESA:");

        spnMesa.setModel(new javax.swing.SpinnerNumberModel(1, 1, 123, 1));

        pedidoFacturarBoton.setText("FACTURAR");
        pedidoFacturarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoFacturarBotonActionPerformed(evt);
            }
        });

        pedidoPagoRecibidoBoton.setText("PAGAR");
        pedidoPagoRecibidoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoPagoRecibidoBotonActionPerformed(evt);
            }
        });

        jLabel25.setText("Cargar a la mesa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(buscarProductoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarBotonPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pedidoFacturarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pedidoPagoRecibidoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel15))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pedidoNombreVistaBox)
                                    .addComponent(pedidoCantidadBox, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(pedidoMesaBox))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(pedidoCargarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(buscarProductoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBotonPedidos))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(pedidoNombreVistaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(pedidoCantidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pedidoMesaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pedidoCargarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedidoFacturarBoton)
                    .addComponent(spnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(pedidoPagoRecibidoBoton))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PEDIDOS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 155, 155));

        jLabel9.setText("Crear Plato");

        jLabel10.setText("NOMBRE:");

        jLabel11.setText("TIPO:");

        jLabel12.setText("PRECIO:");

        menuNombreProductoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNombreProductoBoxActionPerformed(evt);
            }
        });

        menuDisponibilidadBox.setText("DISPONIBILIDAD");
        menuDisponibilidadBox.setOpaque(false);
        menuDisponibilidadBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDisponibilidadBoxActionPerformed(evt);
            }
        });

        menuBotonCrearPlato.setText("GUARDAR");
        menuBotonCrearPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotonCrearPlatoActionPerformed(evt);
            }
        });

        jLabel13.setText("Editar producto");

        jLabel14.setText("ID");

        btnMenuBuscar.setText("BUSCAR");
        btnMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBuscarActionPerformed(evt);
            }
        });

        menuEliminarBoton.setText("ELIMINAR");
        menuEliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarBotonActionPerformed(evt);
            }
        });

        imprimirBotonMenu.setText("IMPRIMIR PLATOS");
        imprimirBotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBotonMenuActionPerformed(evt);
            }
        });

        menuEditarBoton.setText("EDITAR");
        menuEditarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuDisponibilidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuTipoProductoBox, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(menuNombreProductoBox)
                            .addComponent(menuPrecioProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addGap(97, 97, 97)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuBotonCrearPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimirBotonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(menuBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuEliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuEditarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(menuNombreProductoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(menuTipoProductoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel26)
                            .addComponent(menuPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(imprimirBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuBotonCrearPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(menuDisponibilidadBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(menuBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMenuBuscar)
                        .addGap(9, 9, 9)
                        .addComponent(menuEditarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuEliminarBoton)
                        .addGap(47, 47, 47))))
        );

        jTabbedPane1.addTab("MENU", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 155, 155));

        jLabel5.setText("NOMBRE:");

        jLabel6.setText("CEDULA:");

        jLabel7.setText("TELEFONO:");

        clienteBotonCrear.setText("GUARDAR");
        clienteBotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteBotonCrearMouseClicked(evt);
            }
        });
        clienteBotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBotonCrearActionPerformed(evt);
            }
        });

        jLabel8.setText("Crear clientes");

        chxIsPreferencial.setText("PREFERENCIAL");
        chxIsPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxIsPreferencialActionPerformed(evt);
            }
        });

        jLabel27.setText("ID CLIENTE");

        btnClienteEditar.setText("EDITAR");
        btnClienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditarActionPerformed(evt);
            }
        });

        btnListarClientes.setText("MOSTRAR");
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(chxIsPreferencial)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(clienteBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clienteBoxTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(clienteBoxCedula))))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteBotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnClienteEditar))
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(clienteBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(clienteBoxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(clienteBotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clienteBoxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListarClientes)))
                .addGap(18, 18, 18)
                .addComponent(chxIsPreferencial)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(btnClienteEditar)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTES", jPanel6);

        Pantalla.setEditable(false);
        Pantalla.setColumns(20);
        Pantalla.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Pantalla.setRows(5);
        jScrollPane1.setViewportView(Pantalla);

        btnGuardarCambios.setText("GUARDAR CAMBIOS");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarCambios)
                                .addGap(75, 75, 75))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarCambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarMesa(int n)
    {
        return n < NUM_MESAS && n >= 0;
    }
    
    private void clienteBotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteBotonCrearMouseClicked
    
        String nombre   = clienteBoxNombre.getText();
        String cedula   = clienteBoxCedula.getText();
        String telefono = clienteBoxTelefono.getText();
        boolean isPreferencial = chxIsPreferencial.isSelected();
        
        //validar cedula
        for (int i = 0; i < Lclientes.size(); i++) 
        {
            if(Lclientes.get(i).getCedula().equals(cedula))
            {
                return;
            }
        }
        
        Cliente clien   = new Cliente(nombre, telefono, cedula, isPreferencial);
        Lclientes.add(clien);
        
        //int nClientes = Lclientes.size() - 1;
        //System.out.println("nClientes: "+ nClientes);
        
        //Pantalla.append(Lclientes.get(nClientes).getNombre()+" "+Lclientes.get(nClientes).getTelefono()+"\n");
        
        
        
    }//GEN-LAST:event_clienteBotonCrearMouseClicked

    private void clienteBotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBotonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteBotonCrearActionPerformed

    private void menuBotonCrearPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotonCrearPlatoActionPerformed
        // TODO add your handling code here:
        String nombre   = menuNombreProductoBox.getText();
        String tipo   = menuTipoProductoBox.getText();
        int precio = Integer.parseInt(menuPrecioProducto.getText());
        boolean disponibilidad = menuDisponibilidadBox.isSelected();
        
        //validar platos
        for (int i = 0; i < plato.size(); i++) 
        {
            if(plato.get(i).getNombre().equals(nombre))
            {
                return;
            }
        }
        
        Producto p = new Producto(nombre, tipo, precio, disponibilidad);
        plato.add(p);
        
        int nPlato = plato.size() - 1;
        
        //Pantalla.append(plato.get(nPlato).getNombre()+" "+plato.get(nPlato).getPrecio()+"\n");
              
    }//GEN-LAST:event_menuBotonCrearPlatoActionPerformed

    private void menuNombreProductoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNombreProductoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNombreProductoBoxActionPerformed

    private void menuDisponibilidadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDisponibilidadBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDisponibilidadBoxActionPerformed

    private void imprimirBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBotonMenuActionPerformed
        
        Pantalla.setText("");
        
        for(int i=0; i<plato.size(); i++)
        {
            if(plato.get(i).isDisponibilidad())
            {
                Pantalla.append(plato.get(i).getNombre()+" "
                                +plato.get(i).getTipo()+" "
                                    +plato.get(i).getPrecio()+"\n");
            }
        }
    }//GEN-LAST:event_imprimirBotonMenuActionPerformed

    private void btnMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBuscarActionPerformed
        
        //buscar el producto por su id
        int pos =  Integer.parseInt(menuBuscarProducto.getText()) - 1;
        
        Producto p = plato.get(pos);
        
        menuNombreProductoBox.setText(p.getNombre());
        menuTipoProductoBox.setText(p.getTipo());
        menuPrecioProducto.setText(String.valueOf(p.getPrecio()));
        menuDisponibilidadBox.setSelected(p.isDisponibilidad()); 
        
    }//GEN-LAST:event_btnMenuBuscarActionPerformed

    private void reservaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaBotonActionPerformed
        
        //obtener los valores de los campos
        String cliente = nombreClienteBoxReserva.getText();
        Date fecha     = jDateFecha.getDate();
        int hora       = (Integer) reservaHoraBox.getValue();
        int numMesa    = (Integer) mesaReservaBox.getValue();
        
        //salir si el numero es erroneo
        if(!validarMesa(numMesa))
        {
            return;
        }
        
        //validar cliente
        for(int i = 0; i < Lclientes.size(); i++) 
        {
            if(Lclientes.get(i).getNombre().equals(cliente) && Lclientes.get(i).isIsPreferencial())
            {
                //validar duplicado de reserva 
                for(int j = 0; j < reservaList.size(); j++) 
                {
                    if(reservaList.get(j).getNumMesa() == numMesa && reservaList.get(j).getFecha().equals(fecha) && reservaList.get(j).getHora() == hora)
                    {
                        return;
                    }
                }
                
                //crear el objeto de la reserva
                Reserva r = new Reserva(fecha, numMesa, hora, cliente);

                //agregar la reserva a la lista de reserva
                reservaList.add(r);
                
                break;
            }
        }
        
        
    }//GEN-LAST:event_reservaBotonActionPerformed

    private void pedidoNombreVistaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoNombreVistaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoNombreVistaBoxActionPerformed

    private void BuscarBotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBotonPedidosActionPerformed
        
        String nombrePoducto = buscarProductoBox.getText();
        
        for(int i=0; i<this.plato.size(); i++)
        {
            if(nombrePoducto.equals(plato.get(i).getNombre()))
            {
                //salir si el producto no esta disponible
                if(!plato.get(i).isDisponibilidad())
                {
                    return;
                }
                
                //agregar el producto a la orden
                pedidoNombreVistaBox.setText(nombrePoducto);
                return;
            }
        }
        
        pedidoNombreVistaBox.setText(null);
    }//GEN-LAST:event_BuscarBotonPedidosActionPerformed

    private void pedidoCargarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoCargarBotonActionPerformed
        
        if(pedidoNombreVistaBox != null)
        {
            String nombreProducto = pedidoNombreVistaBox.getText();
            int cantidad = (Integer) pedidoCantidadBox.getValue();
            int numMesa  = (Integer) pedidoMesaBox.getValue();
            
            //salir si el numero es erroneo
            if(!validarMesa(numMesa))
            {
                return;
            }
            
            //referencia al producto a buscar
            Producto prod = null;
            
            //guardar si el producto se encontro o no
            boolean PEncontrado = false;
            
            //buscar el objeto producto a partir del nombre
            for(int i=0; i<plato.size(); i++)
            {
                if(plato.get(i).getNombre().equals(nombreProducto))
                {
                    prod = plato.get(i);
                    
                    //salir si el producto no esta disponible
                    if(!prod.isDisponibilidad())
                    {
                        return;
                    }
                    
                    PEncontrado = true;
                    break;
                }
                
            }
            
            //salir de la funcion si el producto no fue encontrado
            if(!PEncontrado)
            {
                return;
            }
            
            //buscar si hay ya un pedido para esa mesa
            for(int i=0; i<pedidoList.size(); i++)
            {
                if(pedidoList.get(i).getMesa() == numMesa)
                {
                    pedidoList.get(i).addProducto(prod);
                    pedidoList.get(i).addCantidad(cantidad);
            
                    //System.out.println(pedidoList.get(0));
                    
                    return;
                }
            }
            
            //si esa mesa no tiene un producto asociado, se crea el pedio
            Pedido p = new Pedido(numMesa);
            p.addProducto(prod);
            p.addCantidad(cantidad);
            
            pedidoList.add(p);
            
            //System.out.println(pedidoList.get(0));
            
        }
    }//GEN-LAST:event_pedidoCargarBotonActionPerformed

    private void pedidoFacturarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoFacturarBotonActionPerformed
        
        //obtener el numero de la mesa
        int numMesa = (Integer) spnMesa.getValue();
        
        //limpiar la pantalla
        Pantalla.setText("");
        
        //pedido asociado a la mesa
        Pedido p = null;
        
        //buscar el pedido asociado a esa mesa
        for(int i = 0; i < pedidoList.size(); i++) 
        {
            if(pedidoList.get(i).getMesa() == numMesa)
            {
                p = pedidoList.get(i);
            }
        }
        
        if(p != null)
        {
            //imprimir en la pantalla la factura asociada a ese pedido
            for(int i=0; i<p.nProductos(); i++)
            {
                Pantalla.append(p.getProducto(i)+"\n");
            }

            Pantalla.append("\nTotal: "+p.calcularTotal());
        }
    }//GEN-LAST:event_pedidoFacturarBotonActionPerformed

    private void chxIsPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxIsPreferencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxIsPreferencialActionPerformed

    private void menuEditarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarBotonActionPerformed
        // TODO add your handling code here:
        int pos =  Integer.parseInt(menuBuscarProducto.getText()) - 1;
        
        Producto p = plato.get(pos);
        
        p.setNombre(menuNombreProductoBox.getText());
        p.setTipo(menuTipoProductoBox.getText());
        p.setPrecio(Double.parseDouble(menuPrecioProducto.getText()));
        p.setDisponibilidad(menuDisponibilidadBox.isSelected());
        
    }//GEN-LAST:event_menuEditarBotonActionPerformed

    private void menuEliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarBotonActionPerformed
        
        int pos =  Integer.parseInt(menuBuscarProducto.getText()) - 1;
        plato.remove(pos);
        
    }//GEN-LAST:event_menuEliminarBotonActionPerformed

    private void btnReservaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaBuscarActionPerformed
        
        int pos =  (Integer) IdreservaBox.getValue() - 1;
        
        Reserva r = reservaList.get(pos);
        
        nombreClienteBoxReserva.setText(r.getNombreCliente());
        jDateFecha.setDate(r.getFecha());
        reservaHoraBox.setValue(r.getHora());
        mesaReservaBox.setValue(r.getNumMesa());
        
    }//GEN-LAST:event_btnReservaBuscarActionPerformed

    private void reservasEditarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasEditarBotonActionPerformed
        
        int pos =  (Integer) IdreservaBox.getValue() - 1;
        
        Reserva r = reservaList.get(pos);
        
        int nMesa = (Integer) mesaReservaBox.getValue();
        
        //salir si el numero es erroneo
        if(!validarMesa(nMesa))
        {
            return;
        }
        
        r.setNombreCliente(nombreClienteBoxReserva.getText());
        r.setFecha(jDateFecha.getDate());
        r.setHora( (Integer) reservaHoraBox.getValue());
        r.setNumMesa( (Integer) mesaReservaBox.getValue());
    }//GEN-LAST:event_reservasEditarBotonActionPerformed

    private void reservasEliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasEliminarBotonActionPerformed
        
        int pos =  (Integer) IdreservaBox.getValue() - 1;
        reservaList.remove(pos);
        
    }//GEN-LAST:event_reservasEliminarBotonActionPerformed

    private void btnClienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditarActionPerformed
        
        int pos =  Integer.parseInt(txtIdCliente.getText()) - 1;
        Cliente c = Lclientes.get(pos);
        
        c.setNombre(clienteBoxNombre.getText());
        c.setCedula(clienteBoxCedula.getText());
        c.setTelefono(clienteBoxTelefono.getText());
        c.setIsPreferencial(chxIsPreferencial.isSelected());
        
    }//GEN-LAST:event_btnClienteEditarActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        
        Pantalla.setText("");
        
        for(int i=0; i<Lclientes.size(); i++)
        {
            Pantalla.append(Lclientes.get(i).getNombre()+" "
                            +Lclientes.get(i).getCedula()+" "
                                +Lclientes.get(i).getTelefono()+" "
                                    +Lclientes.get(i).isIsPreferencial()+"\n");
        }
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int pos =  Integer.parseInt(txtIdCliente.getText()) - 1;
        Cliente c = Lclientes.get(pos);
        
        clienteBoxNombre.setText(c.getNombre());
        clienteBoxCedula.setText(c.getCedula());
        clienteBoxTelefono.setText(c.getTelefono());
        chxIsPreferencial.setSelected(c.isIsPreferencial());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reservaBotonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaBotonVerActionPerformed
        
        Pantalla.setText("");
        
        for(int i=0; i<reservaList.size(); i++)
        {
            Pantalla.append(reservaList.get(i).getNombreCliente()+" "
                                +reservaList.get(i).getFecha().toString()+" "
                                    +reservaList.get(i).getHora()+" "
                                        +reservaList.get(i).getNumMesa()+"\n");
        }
    }//GEN-LAST:event_reservaBotonVerActionPerformed

    private void pedidoPagoRecibidoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoPagoRecibidoBotonActionPerformed
        
        //obtener el numero de la mesa
        int numMesa = (Integer) spnMesa.getValue();
        
        //pedido asociado a la mesa
        Pedido p = null;
        
        //buscar el pedido asociado a esa mesa
        for(int i = 0; i < pedidoList.size(); i++) 
        {
            if(pedidoList.get(i).getMesa() == numMesa)
            {
                pedidoList.remove(i);
            }
        }
    }//GEN-LAST:event_pedidoPagoRecibidoBotonActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        
        File archivo = new File("datos.txt");
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        try
        {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            
            DatosRestaurante dr = new DatosRestaurante(plato, Lclientes, reservaList, pedidoList, NUM_MESAS);
            
            oos.writeObject(dr);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileNotFoundException");
        }
        catch(IOException ioe)
        {
            System.out.println("IOException");
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cargarDatos() throws ClassNotFoundException
    {
        File archivo = new File("datos.txt");
        FileInputStream fis;
        ObjectInputStream ois;
        
        try
        {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            
            //DatosRestaurante dr = new DatosRestaurante(plato, Lclientes, reservaList, pedidoList, NUM_MESAS);
            
            DatosRestaurante dt = (DatosRestaurante) ois.readObject();
            
            if(dt.getPlato() != null)
            {
                plato = dt.getPlato();
            }
            else
            {
                plato = new ArrayList<>();
            }
            
            if(dt.getLclientes() != null)
            {
                Lclientes = dt.getLclientes();
            }
            else
            {
                Lclientes = new ArrayList<>();
            }
            
            if(dt.getReservaList() != null)
            {
                reservaList = dt.getReservaList();
            }
            else
            {
                reservaList = new ArrayList<>();
            }
            
            
            if(dt.getPedidoList() != null)
            {
                pedidoList = dt.getPedidoList();
            }
            else
            {
                pedidoList = new ArrayList<>();
            }
            
            NUM_MESAS = dt.getNUM_MESAS();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("FileNotFoundException");
        }
        catch(IOException ioe)
        {
            System.out.println("IOException");
            ioe.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBotonPedidos;
    private javax.swing.JSpinner IdreservaBox;
    private javax.swing.JTextArea Pantalla;
    private javax.swing.JButton btnClienteEditar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnMenuBuscar;
    private javax.swing.JButton btnReservaBuscar;
    private javax.swing.JTextField buscarProductoBox;
    private javax.swing.JCheckBox chxIsPreferencial;
    private javax.swing.JButton clienteBotonCrear;
    private javax.swing.JTextField clienteBoxCedula;
    private javax.swing.JTextField clienteBoxNombre;
    private javax.swing.JTextField clienteBoxTelefono;
    private javax.swing.JButton imprimirBotonMenu;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton menuBotonCrearPlato;
    private javax.swing.JTextField menuBuscarProducto;
    private javax.swing.JCheckBox menuDisponibilidadBox;
    private javax.swing.JButton menuEditarBoton;
    private javax.swing.JButton menuEliminarBoton;
    private javax.swing.JTextField menuNombreProductoBox;
    private javax.swing.JTextField menuPrecioProducto;
    private javax.swing.JTextField menuTipoProductoBox;
    private javax.swing.JSpinner mesaReservaBox;
    private javax.swing.JTextField nombreClienteBoxReserva;
    private javax.swing.JSpinner pedidoCantidadBox;
    private javax.swing.JButton pedidoCargarBoton;
    private javax.swing.JButton pedidoFacturarBoton;
    private javax.swing.JSpinner pedidoMesaBox;
    private javax.swing.JTextField pedidoNombreVistaBox;
    private javax.swing.JButton pedidoPagoRecibidoBoton;
    private javax.swing.JButton reservaBoton;
    private javax.swing.JButton reservaBotonVer;
    private javax.swing.JSpinner reservaHoraBox;
    private javax.swing.JButton reservasEditarBoton;
    private javax.swing.JButton reservasEliminarBoton;
    private javax.swing.JSpinner spnMesa;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}


