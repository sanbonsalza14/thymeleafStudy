package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @GetMapping("info")
    public String product(Model model) {
        String url = "/product";
        List<Product> products = new ArrayList<>();
        Product cola = new Product();
        cola.setName("콜라");
        cola.setPrice(1000);
        cola.setStock(10);
        products.add(cola);

        Product cyder = new Product();
        cyder.setName("사이다");
        cyder.setPrice(1200);
        cyder.setStock(7);
        products.add(cyder);
        model.addAttribute("products", products);
      url=url + "/product_info";
      return url;

//        @GetMapping("infoWithMap")
//        public String productWithMap(Model model) {
//            Map<String, Product> productMap = new HashMap<>();
//
//            Product cola = new Product("콜라", 1000, 10);
//            Product cyder = new Product("사이다", 1200, 7);
//
//            productMap.put("cola", cola);
//            productMap.put("cyder", cyder);
//
//            model.addAttribute("productMap", productMap); // 맵 전달
//            return "product/infoWithMap";

        // 여러 가지 제품의 리스트와 맵을 같이 전달
//        @GetMapping("infoWithListAndMap")
//        public String productWithListAndMap(Model model) {
//            List<Product> products = new ArrayList<>();
//            Map<String, Product> productMap = new HashMap<>();
//
//            Product cola = new Product("콜라", 1000, 10);
//            Product cyder = new Product("사이다", 1200, 7);
//
//            products.add(cola);
//            products.add(cyder);
//            productMap.put("cola", cola);
//            productMap.put("cyder", cyder);
//
//            model.addAttribute("productsList", products); // 리스트 전달
//            model.addAttribute("productMap", productMap); // 맵 전달
//            return "product/infoWithListAndMap";
//        }
//
//// 또 다른 방식: 제품 객체를 통해 다양한 방식으로 전달
//        @GetMapping("infoWithObject")
//        public String productWithObject(Model model) {
//            Product cola = new Product("콜라", 1000, 10);
//            model.addAttribute("product", cola); // 단일 객체 전달
//            return "product/infoWithObject";
        }

    }









