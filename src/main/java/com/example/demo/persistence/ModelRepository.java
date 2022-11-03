package com.example.demo.persistence;

import com.example.demo.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.MappedSuperclass;
import java.util.List;

@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T,Long> {
    public List<T> findAll();

}
