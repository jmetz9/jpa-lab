package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="recipe", schema = "recipe")
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @Column(name="recipe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="recipe_chef_id")
    private Chef chef;
    @Column(name="recipe_title")
    private String title;
    @Column(name="recipe_description")
    private String description;

}
