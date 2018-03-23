package com.todo.repository;

import org.springframework.data.repository.CrudRepository;
import com.todo.model.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, Integer>{

}
