package com.example.repository;

import com.example.entity.DataSourceEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author stliu @ apache.org
 */
@Repository
public interface DataSourceEntityRepository extends JpaRepository<DataSourceEntity,Long>{
}
