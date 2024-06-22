/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pendaftar;
import java.util.ArrayList;
/**
 *
 * @author fauzanalfaraby
 */
public class PendaftarNamaKegiatanDecorator extends DecoratorTable{
    private final String nama_kegiatan;
    
    public PendaftarNamaKegiatanDecorator(Table decoratedTable, String nama_kegiatan){
        super(decoratedTable);
        this.nama_kegiatan = nama_kegiatan;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyNamaKegiatanFilter();
    }
    
    private ArrayList<Pendaftar> applyNamaKegiatanFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getNamaKegiatan().contains(nama_kegiatan)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }
}
