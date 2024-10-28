package org.Reservations.model; // Paquete de la clase Price

import java.math.BigDecimal; // Importa BigDecimal para representar precios
import java.util.Objects; // Importa Objects para el manejo de objetos

public class Price {
    private Long id; // Identificador del precio
    private BigDecimal totalPrice; // Precio total
    private BigDecimal totalTax; // Impuesto total
    private BigDecimal basePrice; // Precio base

    // Getters y Setters
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica si son la misma instancia
        if (o == null || getClass() != o.getClass()) return false; // Verifica si es el mismo tipo
        Price price = (Price) o; // Hace un casting seguro
        return Objects.equals(id, price.id) &&
                Objects.equals(totalPrice, price.totalPrice) &&
                Objects.equals(totalTax, price.totalTax) &&
                Objects.equals(basePrice, price.basePrice); // Compara los atributos
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalPrice, totalTax, basePrice); // Genera el código hash
    }
}
