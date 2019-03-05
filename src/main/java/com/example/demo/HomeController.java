package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String listCourses(Model model) {
        model.addAttribute("books", bookRepository.findAll()); //generate select * statement
        return "list";
    }

    @GetMapping("/add")
    public String bookForm(Model model) {
        model.addAttribute("book", new Book());
        return "bookform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "bookform";
        }
        bookRepository.save(book);//generate SQL statement and insert into database
        return "redirect:/";
    }

    @RequestMapping("/detail/{SKU}")
    public String showCourse(@PathVariable("SKU") String SKU, Model model) {
        model.addAttribute("book", bookRepository.findById(SKU).get());
        return "show";
    }

    @RequestMapping("/update/{SKU}")
    public String updateCourse(@PathVariable("SKU") String SKU, Model model) {
        model.addAttribute("book", bookRepository.findById(SKU).get());
        return "bookform";
    }

    @RequestMapping("/delete/{SKU}")
    public String delCourse(@PathVariable("SKU") String SKU){
        bookRepository.deleteById(SKU);
        return "redirect:/";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        return "about";
    }
}
