package com.example.controller;

import com.example.data.FormData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "inputForm";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute FormData formData, Model model) {
        // Обработка данных формы
        // Например, можно сохранить данные в базу данных или выполнить другие действия
        // Здесь просто добавим данные в модель для отображения на другой странице
        model.addAttribute("name", formData.getName());
        model.addAttribute("email", formData.getEmail());
        return "formData";
    }
}
