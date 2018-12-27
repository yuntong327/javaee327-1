package cn.itcast.core.service;

import cn.itcast.core.pojo.entity.PageResult;
import cn.itcast.core.pojo.template.TypeTemplate;

import java.util.List;
import java.util.Map;

public interface TypeTemplateService {

    public List<TypeTemplate> findAll();

    PageResult search(Integer page, Integer rows, TypeTemplate typeTemplate);

    void add(TypeTemplate tt);

    void update(TypeTemplate tt);

    TypeTemplate findOne(Long id);

    List<Map> findBySpecList(Long id);
}
