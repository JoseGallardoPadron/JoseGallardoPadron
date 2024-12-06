package pe.edu.vallegrande.inventory.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.inventory.model.ProductModel;

public interface ProductRepository extends ReactiveCrudRepository<ProductModel, Long> {
    // Métodos personalizados, si es necesario
}