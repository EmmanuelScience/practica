package org.example;


public class ObraArte {
    private int id;
    private String  tipo;
    private String nombre;
    private String autor;
    private double precio;

    private double altura;

    private double peso;

    private String material;

    private String  tecnica;

    private int numPiezas;

    private String  descripcion;

    private static final int KG_TON  = 1000;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String  getTipo() {
        return this.tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarObra() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio(€): " + this.precio);
        System.out.println("Altura(m): " + this.altura);
        System.out.println("Peso(t): " + this.peso);
        System.out.println("Numero de piezas: " + this.numPiezas);
        System.out.println("Descripcion: " + this.descripcion);
    }

    public double calcularPrecio() {
        double precioFinal = 0;
        double precioComision = 0.25 * this.precio;
        double precioPeso = 0;
        double precioAltura = 0;
        double descuento = 0;

        if (this.peso/KG_TON > 1) {
            precioPeso = 100;
        } else {
            precioPeso = 20;
        }

        if (this.altura> 2) {
            precioAltura = 100;
        } else {
            precioAltura = 20;
        }

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso(t): " + this.peso);
        System.out.println("Numero de piezas: " + this.numPiezas);
        System.out.println("Precio(€): " + this.precio);
        System.out.println("Comision Galeria(€): " + precioComision);
        System.out.println("Importe por peso(€): " + precioPeso);
        System.out.println("Importe por altura(€): " + precioAltura);
        for (int i = 3; i <= this.numPiezas; i++) {
            System.out.println("Importe adicional - Pieza "+ i + " (€): " + 10);
            precioFinal += 10;
        }

        System.out.println("Precio de venta (€): " + precioFinal);
        if (this.tipo == "Escultura") {
            descuento = 0.20 * precioFinal;
            precioFinal += 50;
            System.out.println("Descuento (20% escultura €): " + descuento);
        } else {
            descuento = 0.1 * precioFinal;
            System.out.println("Descuento (10% oleo €): " + descuento);
        }

        precioFinal = precioFinal + precioPeso + precioAltura + precioComision - descuento;
        System.out.println("Precio final de venta (€): " + precioFinal);
        return precioFinal;
    }
}
