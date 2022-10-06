package edu.wctc.jpalab.entity.collection;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="collector", schema = "collection")
@Data
@NoArgsConstructor
public class Collector {
    @Id
    @Column(name="collector_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="collector_firstname")
    private String firstName;
    @Column(name="collector_lastname")
    private String lastName;
    @Column(name="collector_avatar")
    private String avatar;
}
