package com.example1609.ecole.request.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by valueit-mac-yelkarkouri on 2019-04-27.
 */
@Entity
@Table(name = "requests")
public class RequestEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "reference", unique = true, nullable = false)
    @Getter
    @Setter
    private String reference;

    @Column(name = "object")
    @Getter
    @Setter
    private String object;

    @Column(name = "summary")
    @Getter
    @Setter
    private String summary;

    @Column(name = "hour")
    @Getter
    @Setter
    private Integer hour;

    @Column(name = "minute")
    @Getter
    @Setter
    private Integer minute;

    @Column(name = "request_date")
    @Getter
    @Setter
    private LocalDate dateOfRequest;

    @OneToMany(
            mappedBy = "request",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Getter
    @Setter
    protected List<RequestAttributeValueEntity> attributeValues;

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "type_id")
    @Getter
    @Setter
    protected RequestTypeEntity type;
}
