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
public class PendaftarAlamatDecorator extends DecoratorTable{
    private final String alamat;
    
    public PendaftarAlamatDecorator(Table decoratedTable, String alamat){
        super(decoratedTable);
        this.alamat = alamat;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyAlamatFilter();
    }
    
    private ArrayList<Pendaftar> applyAlamatFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getAlamat().contains(alamat)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    } 
}
