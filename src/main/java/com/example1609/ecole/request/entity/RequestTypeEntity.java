package com.example1609.ecole.request.entity;

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
@Table(name = "request_types")
public class RequestTypeEntity implements Serializable {

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

    @Column(name = "value")
    @Getter
    @Setter
    private String value;

    @ManyToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "request_types_attributes",
            joinColumns = @JoinColumn(
                    name = "request_type_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "attribute_id"
            )
    )
    @Getter
    @Setter
    private List<RequestAttributeEntity> attributes = new ArrayList<>();

}


