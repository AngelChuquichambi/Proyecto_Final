package com.emergentes.modelo;

public class Ventas {

    private int id;
    private int empleado;
    private int cliente;
    private int automovil;
    private String fecha_venta;

    public Ventas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getAutomovil() {
        return automovil;
    }

    public void setAutomovil(int automovil) {
        this.automovil = automovil;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

}
