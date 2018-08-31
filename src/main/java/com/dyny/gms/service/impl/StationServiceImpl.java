package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.ContactStationRelMapper;
import com.dyny.gms.db.dao.StationMapper;
import com.dyny.gms.db.pojo.ContactStationRel;
import com.dyny.gms.db.pojo.ContactStationRelExample;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.db.pojo.StationExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.StationService;
import com.dyny.gms.utils.Tool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationServiceImpl extends BaseService implements StationService {


    @Autowired
    StationMapper stationMapper;
    @Autowired
    ContactStationRelMapper contactStationRelMapper;

    @Override
    public int updateStation(Station station) {
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andStationNoEqualTo(station.getStationNo());
        example.or(criteria);
        return stationMapper.updateByExample(station, example);
    }

    @Override
    public String getStationListByContactId(String customerNo, List<Integer> contactIdList, int pageNum, int pageSize, String orderBy) {
        StationExample stationExample = new StationExample();
        ContactStationRelExample contactStationRelExample = new ContactStationRelExample();
        contactStationRelExample.or().andContactIdIn(contactIdList).andDeletedEqualTo(false);
        List<ContactStationRel> contactStationRels = contactStationRelMapper.selectByExample(contactStationRelExample);
        if (contactStationRels == null || contactStationRels.size() == 0) {
            return super.getSuccessResult(null, pageNum, pageSize, 0);
        }
        List stationNos = new ArrayList();
        for (ContactStationRel temp : contactStationRels) {
            stationNos.add(temp.getStationNo());
        }
        stationExample.or().andStationNoIn(stationNos).andCustomerNoEqualTo(customerNo);
        Page page = PageHelper.startPage(pageNum, pageSize);
        page.setOrderBy(orderBy);
        List result = stationMapper.selectByExample(stationExample);
        long total = page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
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
     * 删除基站(逻辑删除)
     *
     * @param stationNo
     * @return
     */
    @Override
    public int deleteStation(String stationNo) {
        Station station = new Station();
        station.setDeleted(true);
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCustomerNoEqualTo(stationNo);
        return stationMapper.updateByExampleSelective(station, example);
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
        criteria.andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false);
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
