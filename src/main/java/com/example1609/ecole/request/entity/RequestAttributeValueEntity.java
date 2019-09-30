package com.example1609.ecole.request.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by valueit-mac-yelkarkouri on 2019-04-27.
 */

@Data
@Entity
@Table(name = "request_attribute_values")
public class RequestAttributeValueEntity implements Serializable {

    @EmbeddedId
    private RequestAttributeValueId id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "request_id", insertable = false, updatable = false)
    private RequestEntity request;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "attribute_id", insertable = false, updatable = false)
    private RequestAttributeEntity attribute;

    @Column(name = "value")
    @Getter
    @Setter
    private String value;

}


