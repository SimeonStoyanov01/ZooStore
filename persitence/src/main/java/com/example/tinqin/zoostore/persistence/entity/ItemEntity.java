package com.example.tinqin.zoostore.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "items")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    private String title;
    @ManyToOne()
    //@JoinColumn(referencedColumnName = "items",nullable = false)
    private VendorEntity vendor;
    @ManyToMany(mappedBy = "items")
    private Set<TagEntity> tag;
    @OneToMany
    private Set<MultimediaEntity> multimedia;

    @Column(name = "is_archived")
    private Boolean isArchived;

}