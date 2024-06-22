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
public class PendaftarNamaDecorator extends DecoratorTable{
    private final String nama;
    
    public PendaftarNamaDecorator(Table decoratedTable, String nama){
        super(decoratedTable);
        this.nama = nama;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyNamaFilter();
    }
    
    private ArrayList<Pendaftar> applyNamaFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getNama().contains(nama)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }    
}
