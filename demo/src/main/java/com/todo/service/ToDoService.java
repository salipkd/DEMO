package com.todo.service;

import java.util.List;

import com.todo.model.ToDo;

public interface ToDoService {

	public List<ToDo> getAllToDos();
	public ToDo updateToDo(ToDo toDo);
	public ToDo addToDo(ToDo toDo);
	public void deleteTodo(Integer id);
}
