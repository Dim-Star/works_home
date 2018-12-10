package com.example.main.dao;

import com.example.main.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/12/6.
 */
@Repository
public interface ResumeDao  extends JpaRepository<Resume,Long>{
}
