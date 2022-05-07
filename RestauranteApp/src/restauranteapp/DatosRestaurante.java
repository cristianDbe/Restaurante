/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauranteapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Win 10
 */
public class DatosRestaurante implements Serializable
{
     //ATRIBUTOS
    private ArrayList<Producto> plato      = new ArrayList();
    private ArrayList<Cliente> Lclientes   = new ArrayList();
    private ArrayList<Reserva> reservaList = new ArrayList();
    private ArrayList<Pedido> pedidoList   = new ArrayList();
    
    //CONSTANTES
    private int NUM_MESAS = 10;

    public DatosRestaurante() {
    
    }
    
    public DatosRestaurante(ArrayList<Producto> plato, ArrayList<Cliente> Lclientes, ArrayList<Reserva> reservaList, ArrayList<Pedido> pedidoList, int NUM_MESAS)
    {
        this.plato       = plato;
        this.Lclientes   = Lclientes;
        this.reservaList = reservaList;
        this.pedidoList  = pedidoList;
        this.NUM_MESAS   = NUM_MESAS;
    }

    public ArrayList<Producto> getPlato() {
        return plato;
    }

    public void setPlato(ArrayList<Producto> plato) {
        this.plato = plato;
    }

    public ArrayList<Cliente> getLclientes() {
        return Lclientes;
    }

    public void setLclientes(ArrayList<Cliente> Lclientes) {
        this.Lclientes = Lclientes;
    }

    public ArrayList<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(ArrayList<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    public ArrayList<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(ArrayList<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public int getNUM_MESAS() {
        return NUM_MESAS;
    }

    public void setNUM_MESAS(int NUM_MESAS) {
        this.NUM_MESAS = NUM_MESAS;
    }
    
    
}
