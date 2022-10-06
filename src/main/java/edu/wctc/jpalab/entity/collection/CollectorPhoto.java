package edu.wctc.jpalab.entity.collection;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="photo", schema = "collection")
@Data
@NoArgsConstructor
public class CollectorPhoto {
    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="photo_collector_id")
    private Collector collector;
    @Column(name="photo_filename")
    private String fileName;
    @Column(name="photo_datestamp")
    private LocalDateTime dateStamp;
    @Column(name="photo_visible")
    private String visible;
}
