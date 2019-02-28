package com.cursan.miam;

public class Aliment {
    public String nom;
    public boolean estCuit;

    public void manger(){
        if(estCuit){
            System.out.println("Miam Miam, cet aliment : " + nom + " est bien cuit !");
        } else {
            System.out.println("Beeerk cet aliment : " + nom + " est cru !");
        }
    }
}
