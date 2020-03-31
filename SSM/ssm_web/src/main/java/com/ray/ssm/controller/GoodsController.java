package com.ray.ssm.controller;

import com.ray.ssm.entity.Goods;
import com.ray.ssm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller("goodsController")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/list")
    public String List(HttpSession session){
        List<Goods> goods =  goodsService.getAll();
        session.setAttribute("Goods", goods);
        return "list.jsp";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add.jsp";
    }

    @RequestMapping("/add")
    public  String add(String name,String price,String quantity){
        Goods good = new Goods();
        good.setName(name);
        good.setPrice(Double.parseDouble(price));
        good.setQuantity(Integer.parseInt(quantity));
        goodsService.add(good);
        return "redirect:list";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        goodsService.remove(id);
        return "redirect:list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(String id,HttpSession session){
        System.out.println(id);
        Goods good=goodsService.get(Integer.parseInt(id));
        session.setAttribute("Good",good);
        return "edit.jsp";
    }


    @RequestMapping("/edit")
    public String edit(String id,String name,String price,String quantity){
        Goods good=goodsService.get(Integer.parseInt(id));
        good.setName(name);
        good.setPrice(Double.parseDouble(price));
        good.setQuantity(Integer.parseInt(quantity));
        goodsService.edit(good);
        return "redirect:list";
    }

}
