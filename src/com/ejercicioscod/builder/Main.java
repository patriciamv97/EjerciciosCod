package com.ejercicioscod.builder;

public class Main {

    public static void main(String[] args) {
        boolean si =true;
        boolean no = false;
        int familiar=1,mediana=2,pequeña=3;

        System.out.println("normal, integral, fina, masa pan, etc..");
        System.out.println("Pizza familiar(1), mediana(2), pequeña(3)");
        Pizza jamonyqueso= new Pizza();
        jamonyqueso.setMasa("masa pan");
        jamonyqueso.setRelleno(si);
        jamonyqueso.setTipo(familiar);
        jamonyqueso.setSalsa(si);
        jamonyqueso.setCebolla(no);
        jamonyqueso.setSinGluten(no);
        jamonyqueso.setExtraQueso(no);
        jamonyqueso.setPiña(no);
        jamonyqueso.setChampiñones(si);
        jamonyqueso.setJamon(si);
        System.out.println("Pizza jamon y queso \n"+jamonyqueso.toString());
        Pizza extraqueso= new Pizza("Masa fina",no,mediana,si,no,no,si,no,no,no);
        System.out.println("Pizza extra de queso \n:"+extraqueso.toString());

    }
}
