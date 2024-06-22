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
public class PendaftarTingkatDecorator extends DecoratorTable{
        private final String tingkat;
    
    public PendaftarTingkatDecorator(Table decoratedTable, String tingkat){
        super(decoratedTable);
        this.tingkat = tingkat;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyTingkatFilter();
    }
    
    private ArrayList<Pendaftar> applyTingkatFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getTingkat().contains(tingkat)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }
}
