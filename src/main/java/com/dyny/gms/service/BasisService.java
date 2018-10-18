package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Basis;

import java.text.ParseException;
import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-12
 * @version:1.0.0
 */
public interface BasisService {

    List getBasisByOffset(int offset, String machNo, int samplingInterval, long startTimestamp, long endTimestamp) throws ParseException;

    Basis getBasisFromCache(String generatorNo);

    Basis getLastBasis(String generatorNo);
}
