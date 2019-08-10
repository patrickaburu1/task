package com.patrick.task.service;

import com.patrick.task.entities.Menu;
import com.patrick.task.repo.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Service
@Transactional
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public Map<String,Object> menus(){
        Map<String,Object> response=new HashMap<>();
        Iterable<Menu> menus=menuRepository.findAll();

        response.put("status","00");
        response.put("menus",menus);
        return response;
    }
}
