package com.exa.api.entity
import javax.validation.constraints.NotNull
import javax.persistence.*

@Entity
@Table(name = "categories")
class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String name

}