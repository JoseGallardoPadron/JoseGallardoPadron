package pe.edu.vallegrande.inventory.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "products")
public class ProductModel {

    @Id
    private Long productId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("unit_price")
    private BigDecimal unitPrice;

    @Column("current_stock")
    private Integer currentStock;

    @Column("minimum_stock")
    private Integer minimumStock;

    @Column("supplier_id")
    private Long supplierId;

    // Se pueden agregar más métodos si es necesario (por ejemplo, para calcular márgenes, etc.)
}
