package com.casestudy.controllers.home;

import com.casestudy.model.Product;
import com.casestudy.service.product.IProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    private ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home/home");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView(("/home/list"));
        List<Product> products = productService.showAllProduct();
        modelAndView.addObject("productsList", products);
        return modelAndView;
    }

    @PostMapping("/search")
    private ModelAndView searchProductByName(@RequestParam String name){
        name = "%" + name + "%";
        List<Product> list = productService.findByProductName(name);
        if (list.size() == 0) return new ModelAndView("error-404");
        ModelAndView modelAndView = new ModelAndView("/home/list");
        modelAndView.addObject("productsList", list);
        return modelAndView;
    }
}
