package com.patrick.task;

import com.patrick.task.controllers.HomeController;
import com.patrick.task.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author patrick on 8/10/19
 * @project task
 */

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ComponentScan(basePackages = {"com.patrick", "javax.servlet"})
@DataJpaTest
public class TestMenu {

    @Autowired
    private HomeController homeController;
    @Autowired
    private MenuService menuService;

    private Logger logger= LoggerFactory.getLogger(getClass());

    @Test
    public void getMenus(){
        logger.info("************** started menu test");
        Map<String,Object> response=menuService.menus();

        assertThat(response.get("status")).isEqualTo("00");

        logger.info("************* test passed");
    }
}
