package com.example1609.ecole.request.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by valueit-mac-yelkarkouri on 2019-04-27.
 */
@Entity
@Table(name = "request_attributes")
public class RequestAttributeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "code")
    @Getter
    @Setter
    private String code;

    @Column(name = "type")
    @Getter
    @Setter
    private String type;

    @Column(name = "ordre")
    @Getter
    @Setter
    private Integer ordre;

    @Column(name = "obligatoire")
    @Getter
    @Setter
    private boolean obligatoire;

    @JsonIgnore
    @OneToMany(
            mappedBy = "attribute",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Getter
    @Setter
    private List<RequestAttributeValueEntity> attributeValues = new ArrayList<>();

}


