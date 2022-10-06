package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="chef", schema = "recipe")
@Data
@NoArgsConstructor
public class Chef {
    @Id
    @Column(name="chef_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="chef_firstname")
    private String firstName;
    @Column(name="chef_lastname")
    private String lastName;
    @Column(name="chef_avatar")
    private String avatar;
}
