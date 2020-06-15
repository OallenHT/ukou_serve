package com.ukou.mapper;

import com.ukou.entity.Works;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface WorksMapper {

    @Select("select * from t_works")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    List<Works> getAll();

    @Select("select * from t_works where id = #{id}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    Works getById(Integer id);

    @Select("select * from t_works where author = #{id}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    List<Works> getByAuthor(Integer id);

    @Select("select * from t_works where title like '%${title}%'")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    List<Works> getByTitle(String title);

    @Select("select * from t_works where content like '%${content}%'")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    List<Works> getByContent(String content);

    @Select("select * from t_works where title like '%${keyWords}%' or content like '%${keyWords}%'")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "title", property = "title"),
            @Result(column = "content", property = "content"),
            @Result(column = "author", property = "author"),
            @Result(column = "upload_time", property = "uploadTime"),
            @Result(column = "size", property = "size"),
            @Result(column = "history_time", property = "historyTime"),
            @Result(column = "whole_time", property = "wholeTime"),
            @Result(column = "view_counts", property = "viewCounts"),
            @Result(column = "like_counts", property = "likeCounts"),
            @Result(column = "comment_counts", property = "commentCounts"),
            @Result(column = "author", property = "user", one = @One(select = "com.ukou.mapper.UserMapper.getUserById", fetchType= FetchType.EAGER))
    })
    List<Works> getByKeyWords(String keyWords);

    @Insert("insert into t_works (title, content, author, upload_time, size, history_time, whole_time, view_counts, like_counts, comment_counts) " +
            " values(#{title}, #{content}, #{author}, #{uploadTime}, #{size}, #{historyTime}, #{wholeTime}, #{viewCounts}, #{likeCounts}, #{commentCounts}}})")
    Integer addWorks(Works works);

    @Update("update t_works set title=#{title}, content=#{content}, author=#{author}, upload_time=#{uploadTime}, size=#{size}, history_time=#{historyTime}, " +
            " whole_time=#{wholeTime}, view_counts=#{viewCounts}, like_counts=#{likeCounts}, commentCounts=#{comment_counts} " +
            " where id=#{id}")
    Integer updateWorks(Works works);

    @Delete("delete from t_works where id=#{id}")
    Integer deleteWorks(Works works);

    @Delete("<script> " +
                " delete from t_works where id in " +
                " <foreach collection='array' item='id' open='(' separator=',' close=')'>#{id}</foreach> " +
            " </script>")
    Integer mutiDelWorks(int[] ids);
}
