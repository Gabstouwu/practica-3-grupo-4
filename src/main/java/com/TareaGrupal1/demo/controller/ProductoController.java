///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.TareaGrupal1.demo.controller;
//
//import com.TareaGrupal1.demo.domain.Producto;
//import com.TareaGrupal1.demo.service.ProductoService;
//import com.TareaGrupal1.demo.service.FirebaseStorageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//@Controller
//@RequestMapping("/producto")
//public class ProductoController {
//    @Autowired
//    private ProductoService productoService;
//    
//    @GetMapping("/listado")
//    public String listado (Model model){
//        
//        var lista=productoService.getProductos(false);
//        model.addAttribute("productos", lista);
//         model.addAttribute("totalProductos", lista.size());
//        return "/producto/listado";
//        
//    }
//    
//    @Autowired
//    private FirebaseStorageService firebaseStorageService;
//    
//    @PostMapping("/guardar")
//    public String guardar(Producto producto,@RequestParam("imagenFile")MultipartFile imagenFile){
//        if (!imagenFile.isEmpty()){
//            productoService.save(producto);
//            String ruta=firebaseStorageService.cargaImagen(imagenFile,
//                    "producto", producto.getIdProducto());
//            
//            producto.setRutaImagen(ruta);
//            
//            
//            
//        }
//        productoService.save(producto);
//       
//        return "redirect:/producto/listado";
//    }
//    @GetMapping("/modificar/{idProducto}")
//    public String modifica (Producto producto,Model model){
//        producto=productoService.getProducto(producto);
//        model.addAttribute("producto", producto);
//        return "producto/modifica";
//    }
//    
//    
//      @GetMapping("/eliminar/{idProducto}")
//    public String elimina (Producto producto){
//        producto=productoService.getProducto(producto);
//      productoService.delete(producto);
//        return "redirect:/producto/listado";
//    }
//}
