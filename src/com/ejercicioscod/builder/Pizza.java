package com.ejercicioscod.builder;

public class Pizza {
    private int masa;
    private  int tamaño;
    private boolean relleno;
    private boolean salsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;
    private int recojida;
    //Tipo masa
    public static final int FINA = 0;
    public static final int PAN = 1;
    //Tamaño
    public static final int PEQUEÑA = 0;
    public static final int MEDIANA = 2;
    public static final int FAMILIAR = 3;
    // Recojida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;


    public Pizza(){
        this.cebolla = true;
        this.recojida = TIENDA;
        this.relleno = false;
        this.sinGluten = false;
        this.tamaño = MEDIANA;
        this.masa = FINA;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa=" + masa +
                ", tamaño=" + tamaño +
                ", relleno=" + relleno +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                ", recojida=" + recojida +
                '}';
    }

    /**
     * @param masa
     * @param tamaño
     * @param relleno
     * @param salsa
     * @param cebolla
     * @param sinGluten
     * @param extraQueso
     * @param piña
     * @param champiñones
     * @param jamon
     * @param recojida
     */


    public Pizza(int masa, int tamaño, boolean relleno, boolean salsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon, int recojida) {
        this.masa = masa;
        this.tamaño = tamaño;
        this.relleno = relleno;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
        this.recojida = recojida;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }


}
