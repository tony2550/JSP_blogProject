package com.cos.blog.domain;

import java.util.List;

import com.cos.blog.domain.board.Board;

public interface CrudDAO<T> {
		//get
		public T findById(int id);
		//get
		public List<T> findAll();
		//post
		public int save(T data);
		//post
		public int update(T data);
		//post
		public int deleteById(int id);
}
