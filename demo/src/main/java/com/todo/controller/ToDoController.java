package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.todo.model.ToDo;
import com.todo.service.ToDoService;

@RestController
public class ToDoController {

	@Autowired
	ToDoService toDoService;
	
	@RequestMapping("/getAllToDos")
	public List<ToDo> getAllToDos() {
		return toDoService.getAllToDos();
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateTodo")
	public ToDo updateTodo(@RequestBody ToDo toDo) {
		return toDoService.updateToDo(toDo);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addToDo")
	public ToDo addToDo(@RequestBody ToDo toDo) {
		return toDoService.addToDo(toDo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteTodo/{id}")
	public Boolean deleteTodo(@PathVariable(name="id") Integer id) {
		toDoService.deleteTodo(id);
		return true;
	}
}
