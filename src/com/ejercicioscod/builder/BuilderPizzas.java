package com.ejercicioscod.builder;

public class BuilderPizzas {
    protected Pizza _pizza;

    public Pizza build() {
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizza();
    }

    public BuilderPizzas setTipoMasa(int masa) {
        _pizza.setMasa(masa);
        return this;
    }
    public BuilderPizzas setTamaño(int tamaño) {
        _pizza.setMasa(tamaño);
        return this;
    }
    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecojida(int recojida) {
        _pizza.setRecojida(recojida);
        return this;
    }
    public BuilderPizzas setSalsa(boolean salsa){
        _pizza.setCebolla(salsa);
        return this;
    }
    public BuilderPizzas setPiña(boolean piña){
        _pizza.setPiña(piña);
        return this;
    }

    public BuilderPizzas setExtraQueso(boolean extraQueso){
        _pizza.setExtraQueso(extraQueso);
        return this;
    }
    public BuilderPizzas setJamon(boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
    public BuilderPizzas setChampiñones(boolean champiñones){
        _pizza.setPiña(champiñones);
        return this;
    }


}
