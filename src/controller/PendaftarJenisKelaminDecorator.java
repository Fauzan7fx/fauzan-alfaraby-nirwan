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
public class PendaftarJenisKelaminDecorator extends DecoratorTable{
    private final String jk;
    
    public PendaftarJenisKelaminDecorator(Table decoratedTable, String jk){
        super(decoratedTable);
        this.jk = jk;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyJenisKelaminFilter();
    }
    
    private ArrayList<Pendaftar> applyJenisKelaminFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getJk().contains(jk)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }    
}
