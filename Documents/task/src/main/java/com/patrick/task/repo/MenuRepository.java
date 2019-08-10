package com.patrick.task.repo;

import com.patrick.task.entities.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Repository
public interface MenuRepository extends CrudRepository<Menu,Long> {

    Menu findDistinctByName(String name);
}
