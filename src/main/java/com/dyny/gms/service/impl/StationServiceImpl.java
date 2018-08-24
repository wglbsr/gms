package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.StationMapper;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.StationService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl extends BaseService implements StationService {
    @Autowired
    StationMapper stationMapper;

    @Override
    public int updateStation(Station station) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(station.getStationNo());
        example.or(criteria);
        return stationMapper.updateByExample(station, example);
    }

    /**
     * 检查基站编号是否重复
     *
     * @param stationNo
     * @return
     */
    @Override
    public int checkStationNo(String stationNo) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(stationNo);
        return (int) stationMapper.countByExample(example);
    }

    /**
     * 删除基站
     *
     * @param stationNo
     * @return
     */
    @Override
    public int deleteStation(String stationNo) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(stationNo);
        return stationMapper.deleteByExample(example);
    }

    /**
     * 根据用户编号获得基站列表
     *
     * @param customerNo
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    @Override
    public String getStationListByUsercus(String customerNo, int pageNum, int pageSize, String orderBy) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(customerNo);
        Page page = PageHelper.startPage(pageNum, pageSize);
        if (Tool.StringUtil.validStr(orderBy)) {
            page.setOrderBy(orderBy);
        }
        List result = stationMapper.selectByExample(example);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }


    /**
     * 更新基站信息
     *
     * @param station
     * @param example
     * @return
     */
    @Override
    public int updateStation(Station station, StationExample example) {
        return stationMapper.updateByExample(station, example);
    }


    /**
     * 添加基站
     *
     * @param station
     * @return
     */
    @Override
    public int addStation(Station station) {
        return stationMapper.insertSelective(station);
    }


    /**
     * 根据条件获得基站
     * 目前只支持基站编号
     *
     * @param station
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public String getStationListByCondition(Station station, int pageNum, int pageSize) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(station.getCustomerNo());
        example.or(criteria);
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = stationMapper.selectByExample(example);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }
}
