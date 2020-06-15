package com.ukou.service.impl;

import com.ukou.entity.Works;
import com.ukou.mapper.WorksMapper;
import com.ukou.service.WorksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {

    @Resource
    private WorksMapper worksMapper;

    @Override
    public List<Works> getAll() {
        return worksMapper.getAll();
    }

    @Override
    public Works getById(Integer id) {
        return worksMapper.getById(id);
    }

    @Override
    public List<Works> getByAuthor(Integer id) {
        return worksMapper.getByAuthor(id);
    }

    @Override
    public List<Works> getByTitle(String title) {
        return worksMapper.getByTitle(title);
    }

    @Override
    public List<Works> getByContent(String content) {
        return worksMapper.getByContent(content);
    }

    @Override
    public List<Works> getByKeyWords(String keyWords) {
        return worksMapper.getByKeyWords(keyWords);
    }

    @Override
    public Integer addWorks(Works works) {
        return worksMapper.addWorks(works);
    }

    @Override
    public Integer updateWorks(Works works) {
        return worksMapper.updateWorks(works);
    }

    @Override
    public Integer deleteWorks(Works works) {
        return worksMapper.deleteWorks(works);
    }

    @Override
    public Integer mutiDelWorks(int[] ids) {
        return worksMapper.mutiDelWorks(ids);
    }
}
