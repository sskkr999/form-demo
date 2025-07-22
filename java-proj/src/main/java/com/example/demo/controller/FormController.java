package com.example.demo.controller;

import com.example.demo.model.UserForm;
import com.example.demo.repository.UserFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private UserFormRepository repository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute UserForm userForm, Model model) {
        repository.save(userForm);
        model.addAttribute("msg", "Form submitted successfully!");
        return "form";
    }
}
