/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Pendaftar;

/**
 *
 * @author fauzanalfaraby
 */
public class PendaftarTlpnDecorator extends DecoratorTable{
    private final String tlpn;
    
    public PendaftarTlpnDecorator(Table decoratedTable, String tlpn){
        super (decoratedTable);
        this.tlpn = tlpn;
    }
    
    @Override
    public ArrayList getList() {
        return (ArrayList) applyTlpnFilter();
    }
        
    private ArrayList<Pendaftar> applyTlpnFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getTlpn().contains(tlpn)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }
}
