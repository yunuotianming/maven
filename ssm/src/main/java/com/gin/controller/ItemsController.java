package com.gin.controller;

import com.gin.domain.Items;
import com.gin.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author gin
 * @date 2019/9/21 18:43
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        //跳转到指定页面 /pages/itemDetail.jsp
        return "itemDetail";
    }

    @RequestMapping(value = "/insert", method ={RequestMethod.POST}, produces  = "application/json;charset=UTF-8")
    @ResponseBody
    public String insert(@RequestBody Items items, HttpServletRequest request) throws Exception{
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.forEach((k, v) -> {
            System.out.println("key=" + k + "  value=" + v);
        });
        System.out.println("items=" + items);
        return "success";
    }

    @RequestMapping(value = "/insert2", method ={RequestMethod.POST}, produces  = "application/json;charset=UTF-8")
    @ResponseBody
    public String insert2(@ModelAttribute Items items, HttpServletRequest request) throws Exception{
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.forEach((k, v) -> {
            System.out.println("key=" + k + "  value=" + v);
        });
        System.out.println("items=" + items);
        return "success";
    }
}
