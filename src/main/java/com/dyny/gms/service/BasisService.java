package com.dyny.gms.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-12
 * @version:1.0.0
 */
public interface BasisService {

    List getBasisByOffset(int offset, String machNo, long startTimestamp, long endTimestamp) throws ParseException;
}
