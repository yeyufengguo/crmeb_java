package com.zbkj.crmeb.store.service.impl;

import com.common.PageParamRequest;
import com.github.pagehelper.PageHelper;

import com.zbkj.crmeb.store.model.StoreBargain;
import com.zbkj.crmeb.store.dao.StoreBargainDao;
import com.zbkj.crmeb.store.request.StoreBargainSearchRequest;
import com.zbkj.crmeb.store.service.StoreBargainService;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author Mr.Zhang
* @description StoreBargainServiceImpl 接口实现
* @date 2020-05-28
*/
@Service
public class StoreBargainServiceImpl extends ServiceImpl<StoreBargainDao, StoreBargain> implements StoreBargainService {

    @Resource
    private StoreBargainDao dao;


    /**
    * 列表
    * @param request 请求参数
    * @param pageParamRequest 分页类参数
    * @author Mr.Zhang
    * @since 2020-05-28
    * @return List<StoreBargain>
    */
    @Override
    public List<StoreBargain> getList(StoreBargainSearchRequest request, PageParamRequest pageParamRequest) {
        PageHelper.startPage(pageParamRequest.getPage(), pageParamRequest.getLimit());

        //带 StoreBargain 类的多条件查询
        LambdaQueryWrapper<StoreBargain> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        StoreBargain model = new StoreBargain();
        BeanUtils.copyProperties(request, model);
        lambdaQueryWrapper.setEntity(model);
        return dao.selectList(lambdaQueryWrapper);
    }

}

