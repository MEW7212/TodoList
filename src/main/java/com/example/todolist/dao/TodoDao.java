package com.example.todolist.dao;

import com.example.todolist.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoDao extends CrudRepository<Todo, Integer> {
}
