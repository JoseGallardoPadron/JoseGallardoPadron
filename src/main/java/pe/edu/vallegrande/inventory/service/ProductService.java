package pe.edu.vallegrande.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.inventory.model.ProductModel;
import pe.edu.vallegrande.inventory.repository.ProductRepository;
import reactor.core.publisher.Flux;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Cambia a Flux en lugar de List
    public Flux<ProductModel> getAllProducts() {
        return productRepository.findAll(); // Retorna un flujo reactivo
    }
}
