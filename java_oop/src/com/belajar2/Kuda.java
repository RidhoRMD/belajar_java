package com.belajar2;

public class Kuda extends Binatang  {
    public static void bersuara() {
        System.out.println("Ngieehhh");
    }
public static void main(String[] args) {
    Binatang  kuda_poni = new Binatang ();
    kuda_poni.bersuara();
}
}
