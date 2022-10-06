package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="photo", schema = "recipe")
@Data
@NoArgsConstructor
public class RecipePhoto {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="photo_recipe_id")
    private Recipe recipe;
    @Column(name="photo_filename")
    private String fileName;
    @Column(name="photo_caption")
    private String caption;
    @Column(name="photo_datestamp")
    private LocalDateTime dateStamp;
    @Column(name="photo_visible")
    private String visible;
}
