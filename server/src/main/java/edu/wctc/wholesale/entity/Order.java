package edu.wctc.wholesale.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "wholesale_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNumber;

    private String terms;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;


}
