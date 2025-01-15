package com.springboot.demo1.lecture;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Long id;
    private String name;
    private String description;
    private double price;
}
