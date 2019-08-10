package com.patrick.task.controllers;

import com.patrick.task.entities.Choices;
import com.patrick.task.entities.Menu;
import com.patrick.task.repo.ChoicesRepository;
import com.patrick.task.repo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@RestController
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ChoicesRepository choicesRepository;

    @RequestMapping(value = "/choices/{menu1}")
    public List<Choices> data(@PathVariable String menu1){
        Menu menu=menuRepository.findDistinctByName(menu1);

        return choicesRepository.findAllByMenuId(menu.getId());
    }
}
