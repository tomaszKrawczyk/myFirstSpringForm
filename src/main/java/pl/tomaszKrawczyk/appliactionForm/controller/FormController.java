package pl.tomaszKrawczyk.appliactionForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.tomaszKrawczyk.appliactionForm.model.Product;

/**
 * Created by Tomek Krawczyk on 23.01.2018.
 */
@Controller
public class FormController {

    @GetMapping("/")
    public String formAplication(){
        return "add";
    }

    @GetMapping("/result")
    public String showResult(@RequestParam String name, @RequestParam String surname, ModelMap modelMap){

        modelMap.addAttribute("name",name);
        modelMap.addAttribute("surname", surname);
        return "result";
    }


    @GetMapping("/add")
    public String showAdd(){
        return "add";
    }

    @GetMapping("/show")
    public String show(@ModelAttribute Product product, ModelMap modelMap){

        modelMap.addAttribute("product",product);
        return "show";
    }


    @GetMapping("/products/{id}")
    public String show2(@PathVariable Long id, ModelMap modelMap){

        modelMap.put("description","Product "+id);

        return "id";


    }
}
