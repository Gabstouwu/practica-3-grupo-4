/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TareaGrupal1.demo.dao;

import com.TareaGrupal1.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductoDao extends JpaRepository<Producto,Long>{
    
}
