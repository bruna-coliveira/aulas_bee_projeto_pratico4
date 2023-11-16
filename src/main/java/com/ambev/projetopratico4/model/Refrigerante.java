package com.ambev.projetopratico4.model;

public class Refrigerante extends Produto{
    private boolean ComAcucar;

    public boolean isComAcucar() {
        return ComAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        ComAcucar = comAcucar;
    }
}
