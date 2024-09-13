package com.farmstory.dao;

import com.farmstory.entity.Cate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CateRepository extends JpaRepository<Cate, Integer> {
}
