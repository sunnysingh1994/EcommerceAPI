package sunny.example.ecommerce.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Item {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;

    public Item() {
    }

    public Item(Long id, double price, String description, String name) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemName() {
        return name;
    }

    public void setItemName(String itemName) {
        this.name = itemName;
    }
}
