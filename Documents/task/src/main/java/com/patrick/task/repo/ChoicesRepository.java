package com.patrick.task.repo;

import com.patrick.task.entities.Choices;
import com.patrick.task.entities.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Repository
public interface ChoicesRepository extends CrudRepository<Choices,Long> {

    List<Choices> findAllByMenuId(long menuId);
}
