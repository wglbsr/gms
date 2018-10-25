package com.dyny.gms.service;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.utils.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;

import java.util.Iterator;
import java.util.List;

public class BaseService extends BaseController {
    @Value("${system.config.admin.level}")
    protected int ADMIN_LEVEL;
    @Value("${database.sql.max}")
    protected int MAX_SQL_SIZE;

    /**
     * 获取所有子用户（只获取用户编号）
     *
     * @param parentCusNo
     * @param users
     * @param target
     */
    protected void getAllChildrenCusNo(String parentCusNo, List<User> users, List<String> target) {
        if (StringUtils.isEmpty(parentCusNo)) {
            return;
        }
        Iterator it = users.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            String userCus = user.getUserCus();
            if (target.contains(userCus) || parentCusNo.equals(userCus)) {
                continue;
            }
            String userParentCus = user.getParentCusNo();
            if (!StringUtils.isEmpty(userParentCus) && userParentCus.equals(parentCusNo)) {
                target.add(userCus);
                getAllChildrenCusNo(userCus, users, target);
            }
        }
    }


    /**
     * 获取所有子节点
     *
     * @param parentCusNo
     * @param users
     * @param target
     */
    protected void getAllChildren(String parentCusNo, List<User> users, List<User> target) {
        if (StringUtils.isEmpty(parentCusNo)) {
            return;
        }
        Iterator it = users.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            String userCus = user.getUserCus();
            if (target.contains(userCus) || parentCusNo.equals(userCus)) {
                continue;
            }
            String userParentCus = user.getParentCusNo();
            if (!StringUtils.isEmpty(userParentCus) && userParentCus.equals(parentCusNo)) {
                target.add(user);
                getAllChildren(userCus, users, target);
            }
        }
    }

    /**
     * md5加密，多用于密码
     *
     * @param content
     * @return
     */
    protected String MD5(String content) {
        if (!StringUtils.isEmpty(content)) {
            return DigestUtils.md5DigestAsHex(content.getBytes());
        } else {
            return "";
        }
    }


    /**
     * 配合like操作
     *
     * @param content
     * @return
     */
    public String appendLike(String content) {
        return "%" + content + "%";
    }
}
