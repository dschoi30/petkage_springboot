package com.kh.petkage.web;

import com.kh.petkage.domain.Item;
import com.kh.petkage.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired ItemService itemService;

    @GetMapping("/items/new")
    public String createForm(Model model) {
        model.addAttribute("form", new ItemDto());
        return "/items/createItemForm";
    }

//    @PostMapping("/items/new")
//    public Long save() {
//
//        return itemService.save();
//    }

}
