package com.smuralee.repository;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.smuralee.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@XRayEnabled
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
