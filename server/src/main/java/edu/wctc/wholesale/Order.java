package edu.wctc.wholesale;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name="wholesale_order")
public class Order {
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="purchase_order_num")
    private String purchaseOrderNumber;

    private String terms;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name="purchase_date")
    private LocalDate purchaseDate;

    @Column(name="shipped_date")
    private LocalDate shippedDate;
}
