package id.tokoonderdil.study.springbootdruid.dao.cluster;

import id.tokoonderdil.study.springbootdruid.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityDao {
    City searchByName(@Param("cityName") String cityName);
}
