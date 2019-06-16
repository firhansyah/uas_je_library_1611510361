package com.exa.api.entity
import javax.validation.constraints.NotNull
import javax.persistence.*

@Entity
@Table(name = "books")
class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

    @NotNull
    @Column(nullable = false)
    String name

    @NotNull
    @Column(nullable = false)
    String isbn

    @NotNull
    @Column(nullable = false)
    Integer year

    @NotNull
    @Column(nullable = false)
    String publisher

    @NotNull
    @Column(nullable = false)
    String author
}