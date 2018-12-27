package cn.itcast.core.service;


import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.entity.SpecificationVo;
import cn.itcast.core.pojo.specification.Specification;

import java.util.List;
import java.util.Map;

public interface SpecificationService {



    PageResult search(Integer page, Integer rows, Specification specification);

    void add(SpecificationVo vo);

    SpecificationVo findOne(Long id);

    void update(SpecificationVo vo);

    void delete(Long[] ids);

    PageResult findPage(Integer page, Integer rows, Specification specification);

    List<Map> selectOptionList();

}
