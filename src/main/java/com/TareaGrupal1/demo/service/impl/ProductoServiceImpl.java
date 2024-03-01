/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TareaGrupal1.demo.service.impl;

import com.TareaGrupal1.demo.dao.ProductoDao;
import com.TareaGrupal1.demo.domain.Producto;
import com.TareaGrupal1.demo.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Pc
 */
@Service 
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
         var lista =productoDao.findAll();
         if(activos){
             lista.removeIf(c-> !c.isActivo());
         }
         
         return lista;
          }

    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto) {       
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
      
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
         }
    
}
