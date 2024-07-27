package com.lmyxlf.jian_mu.business.raising_numbers.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lmy
 * @email 2130546401@qq.com
 * @date 2024/7/24 14:08
 * @description 养号实体类
 * @since 17
 */
@Data
@Accessors(chain = true)
public class RaisingNumbers {

    /**
     * 主键 id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * token
     */
    private String token;

    /**
     * project_type 表主键 id
     */
    private Integer projectId;

    /**
     * 是否删除，0：未删除，1：已删除
     */
    private Integer isDelete;

    /**
     * 备注
     */
    private String remark;
}