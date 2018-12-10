package com.example.main.service.impl;

import com.example.main.dao.PositionDao;
import com.example.main.model.Position;
import com.example.main.service.FindPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/12/6.
 */
@Service("fp")
public class FindPositionServiceImpl implements FindPositionService {


@Autowired
    private PositionDao positionDao;

    @Override
    public Page<Position> ShowMess(Pageable pageable) {
        return positionDao.findAll(pageable);
    }

    @Override
    public Page<Position> QueryByInput(String input,Pageable pageable) {
        return  positionDao.QueryByInput(input,pageable);
    }

}
