package com.patrick.task.controllers;

import com.patrick.task.repo.MenuRepository;
import com.patrick.task.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Controller
public class HomeController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private MenuRepository menuRepository;


    @RequestMapping(value = "/home")
    public Map<String,Object> home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("title","Menu");
        mv.addObject("menus",menuRepository.findAll());
        return menuService.menus();
    }


}
