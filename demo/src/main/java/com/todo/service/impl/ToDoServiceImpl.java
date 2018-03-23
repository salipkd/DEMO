package com.todo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.ToDo;
import com.todo.repository.ToDoRepository;
import com.todo.service.ToDoService;

@Service("toDoService")
public class ToDoServiceImpl implements ToDoService{

	@Autowired
	ToDoRepository toDoRepository;
	@Override
	public List<ToDo> getAllToDos() {
		List<ToDo> toDos=new ArrayList<>();
		toDoRepository.findAll().forEach(toDos::add);
		return toDos;
	}

	@Override
	public ToDo updateToDo(ToDo toDo) {
		toDoRepository.save(toDo);
		return null;
	}

	@Override
	public ToDo addToDo(ToDo toDo) {
		return toDoRepository.save(toDo);
	}

	@Override
	public void deleteTodo(Integer id) {
		toDoRepository.delete(id);
	}

}
