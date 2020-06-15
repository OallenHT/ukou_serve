package com.ukou.service;

import com.ukou.entity.Works;

import java.util.List;

public interface WorksService {

    List<Works> getAll();

    Works getById(Integer id);

    List<Works> getByAuthor(Integer id);

    List<Works> getByTitle(String title);

    List<Works> getByContent(String content);

    List<Works> getByKeyWords(String keyWords);

    Integer addWorks(Works works);

    Integer updateWorks(Works works);

    Integer deleteWorks(Works works);

    Integer mutiDelWorks(int[] ids);
}
