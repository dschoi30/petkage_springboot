package com.kh.petkage.web;

import com.kh.petkage.domain.Item;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/items/new")
    public String createForm(Model model) {
        model.addAttribute("form", new ItemDto());
        return "/items/createItemForm";
    }

}
