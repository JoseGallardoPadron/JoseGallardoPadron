package pe.edu.vallegrande.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.inventory.model.ProductModel;
import pe.edu.vallegrande.inventory.service.ProductService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/products")
@CrossOrigin // Permite solicitudes de diferentes dominios si es necesario
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Flux<ProductModel> getAllProducts() {
        return productService.getAllProducts(); // Devuelve un Flux reactivo
    }
}
