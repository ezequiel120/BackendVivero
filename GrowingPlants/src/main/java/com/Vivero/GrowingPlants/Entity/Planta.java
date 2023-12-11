package com.Vivero.GrowingPlants.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "planta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "nombre")
    private String nombre;
    private int precio;
    private String tipo;
    private String categoria;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "imagen_id", nullable = false)//
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @NonNull
    @Builder.Default
    private Imagen imagen=new Imagen();

}
