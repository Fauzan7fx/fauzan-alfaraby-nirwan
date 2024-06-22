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
public class PendaftarNimDecorator extends DecoratorTable{
    private final String nim;
    
    public PendaftarNimDecorator(Table decoratedTable, String nim){
        super(decoratedTable);
        this.nim = nim;
    }
    
    @Override
    public ArrayList getList(){
        return (ArrayList) applyNimFilter();
    }
    
    private ArrayList<Pendaftar> applyNimFilter(){
        ArrayList<Pendaftar> isi = super.getList();
        
        ArrayList<Pendaftar> filterIsi = new ArrayList();
        for (Pendaftar pfr : isi){
            if (pfr.getNim().contains(nim)){
                filterIsi.add(pfr);
            }
        }
        return filterIsi;
    }
    
}
