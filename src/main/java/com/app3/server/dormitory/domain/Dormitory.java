package com.app3.server.dormitory.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Dormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    private String description;
    private Integer distance;
    private String travelDate;
    private Integer price;
    private Double scope;
    @Builder
    public Dormitory(String imageUrl, String description, Integer distance, String travelDate, Integer price, Double scope) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.distance = distance;
        this.travelDate = travelDate;
        this.price = price;
        this.scope = scope;
    }
}
