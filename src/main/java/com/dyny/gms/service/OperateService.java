package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Operate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface OperateService {
    int insertOperate(Operate operate);

    Operate getOperate(Operate operate);

    List getOperateList(Operate operate);

    int deleteOperate(Operate operate);

    int insertOperate(@RequestBody List<Operate> operateList);
}
