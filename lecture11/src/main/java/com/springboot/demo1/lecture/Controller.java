package com.springboot.demo1.lecture;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = "/index")
    public String indexPage(Model model){

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1l, "Mac Book Pro", "8 GB RAM 255 GB SSD Intel Core i7", 450000.0));
        items.add(new Item(2l, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 600000.0));
        items.add(new Item(3l, "Mac Book Pro", "1 TB RAM 255 GB SSD Apple M1", 800000.0));
        items.add(new Item(4l, "ASUS Tuf Gaming", "8 GB RAM 255 GB SSD Intel Core i7", 550000.0));
        items.add(new Item(5l, "HP Laser Pro", "8 GB RAM 255 GB SSD Intel Core i9", 650000.0));
        items.add(new Item(6l, "Lenovo Legion", "16 GB RAM 1 TB SSD Intel Core i9", 950000.0));

        model.addAttribute("zattar", items);



        return "index";
    }

}
