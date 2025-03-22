package org.csu.gameshop.controller;

import org.csu.gameshop.entity.Product;
import org.csu.gameshop.service.ProductService;
import org.csu.gameshop.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

//    @GetMapping("/main")  // 添加此方法
//    public String productMain(Model model) {
//        List<ProductVO> products = productService.getAllProducts();
//        model.addAttribute("products", products);
//        return "product/main"; // 返回模板路径
//    }

    // 修改后的商品列表接口，返回 JSON 数据
    @GetMapping("/main")
    public List<ProductVO> getProductList() {
        System.out.println("收到前端请求 /product/main");

        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public String productDetail(Integer id, Model model)
    {
        ProductVO productVO=productService.getProductDetail(id);
        model.addAttribute("product", productVO);
        return "/product/product";
    }
}
