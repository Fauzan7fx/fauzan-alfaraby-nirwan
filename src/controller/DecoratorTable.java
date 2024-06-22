/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author fauzanalfaraby
 */
public class DecoratorTable implements Table{
    protected Table decoratedTable;
    
    public DecoratorTable (Table decoratedTable){
        this.decoratedTable = decoratedTable;
    }
    
    @Override
    public ArrayList getList(){
        return decoratedTable.getList();
    }
}
