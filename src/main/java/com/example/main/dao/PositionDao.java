package com.example.main.dao;

import com.example.main.model.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/12/6.
 */
@Repository
public interface PositionDao extends JpaRepository<Position,Long>{
    @Query(value="select * from position p where p.p_posi_name like CONCAT('%',:name,'%') or  p.p_addr like CONCAT('%',:name,'%')",nativeQuery=true)
   public Page<Position> QueryByInput(@Param("name") String input, Pageable pageable);
}
