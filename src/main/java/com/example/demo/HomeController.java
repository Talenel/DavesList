package com.example.demo;

/**
 * Created by student on 6/21/17.
 */
import com.example.demo.models.Listing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private ListingRepository listingRepository;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/addlisting")
    public String greetingForm(Model model) {
        model.addAttribute("listing", new Listing());
        return "addlisting";
    }

    @PostMapping("/addlisting")
    public String greetingSubmit(@Valid Listing listing, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "addlisting";
        }
        listingRepository.save(listing);

        return "redirect:/addlisting";
    }
    @RequestMapping("/updatelisting")
    public String updatelist(Model model)
    {
        Iterable<Listing> roomList=listingRepository.findAll();
        model.addAttribute("roomList",roomList);
        return "updatelisting";
    }
    @RequestMapping("/details/{id}")
    public String moreDetails(@PathVariable("id") Integer id, Model model){

        model.addAttribute("listing", listingRepository.findOne(id.intValue()));
        return "details";
    }

    @RequestMapping("/roomlist")
    public String list(Model model)
    {
        Iterable<Listing> roomList=listingRepository.findAll();
        model.addAttribute("roomList",roomList);
        model.addAttribute("id", " ");
        return "roomlist";
    }

}
