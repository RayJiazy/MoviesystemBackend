package com.mvsys.movie.mapper;

import com.mvsys.movie.model.Movie;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MovieMapper {
    @Select("SELECT * from movieraterank WHERE genre like CONCAT('%', #{genre}, '%') order by publish_date desc LIMIT #{num} OFFSET #{start}")
    Movie[] getMovieInfo_date(@Param("start") int start, @Param("num") int num, @Param("genre") String genre);
    @Select("SELECT * from movieraterank WHERE genre like CONCAT('%', #{genre}, '%') order by rate desc LIMIT #{num} OFFSET #{start}")
    Movie[] getMovieInfo_rate(@Param("start") int start, @Param("num") int num, @Param("genre") String genre);
    @Select("SELECT COUNT(*) from movieraterank WHERE genre like CONCAT('%', #{genre}, '%')")
    Integer getMovie_num(@Param("genre") String genre);
}
