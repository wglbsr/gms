package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.db.dao.LankMapper;
import com.dyny.gms.db.pojo.Lank;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.LankService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class LankServiceImpl extends BaseService implements LankService {
    @Autowired
    LankMapper lankMapper;
    @Autowired
    GeneratorMapper generatorMapper;

    @Override
    public String getLank(String customerNo, String keyWord, int pageNum, int pageSize, long startDate, long endDate) throws ParseException {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = lankMapper.selectByCustomerNoAndKeyWord(startDate, endDate, customerNo, keyWord);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int refuelManually(String generatorNo, float refuelVolumeno) {
        Lank lank = new Lank();
        lank.setCreatTime(new Date());
        lank.setMachNo(generatorNo);
        lank.setSumVolumeno(new BigDecimal(Double.toString(refuelVolumeno)));
        return lankMapper.insert(lank);
    }

}
