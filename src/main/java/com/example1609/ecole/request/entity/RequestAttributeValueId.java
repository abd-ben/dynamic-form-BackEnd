package com.example1609.ecole.request.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class RequestAttributeValueId implements Serializable {

    @Column(name = "request_id")
    private Integer request_id;

    @Column(name = "attribute_id")
    private Integer attribute_id;

    public RequestAttributeValueId() {

    }

    public RequestAttributeValueId(Integer request_id, Integer attribute_id) {
        this.request_id = request_id;
        this.attribute_id = attribute_id;
    }
}
