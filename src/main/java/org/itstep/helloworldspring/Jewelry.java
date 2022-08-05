package org.itstep.helloworldspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jewelry")
public class Jewelry {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private Double price;
    private Double priceNew;
    private byte[] image;
    @OneToMany
    @JoinColumn(name = "material_id")
    private Set<Material> materials;
}
