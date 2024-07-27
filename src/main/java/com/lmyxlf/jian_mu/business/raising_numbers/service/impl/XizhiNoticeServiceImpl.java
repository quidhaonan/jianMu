package com.lmyxlf.jian_mu.business.raising_numbers.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmyxlf.jian_mu.business.raising_numbers.dao.XizhiNoticeDao;
import com.lmyxlf.jian_mu.business.raising_numbers.model.entity.XizhiNotice;
import com.lmyxlf.jian_mu.business.raising_numbers.service.XizhiNoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lmy
 * @email 2130546401@qq.com
 * @date 2024/7/28 3:11
 * @description
 * @since 17
 */
@Service("xizhiNoticeService")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class XizhiNoticeServiceImpl extends ServiceImpl<XizhiNoticeDao, XizhiNotice> implements XizhiNoticeService {

}