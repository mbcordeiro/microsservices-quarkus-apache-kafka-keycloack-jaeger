package org.br.matheuscordeiro.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime date;

    @Column(name = "currency_price")
    private BigDecimal currencyPrice;

    public Quotation(LocalDateTime date, BigDecimal currencyPrice) {
        this.date = date;
        this.currencyPrice = currencyPrice;
    }
}
