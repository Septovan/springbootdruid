package id.tokoonderdil.study.springbootdruid.dao.master;

import id.tokoonderdil.study.springbootdruid.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    User findByName(@Param("userName") String userName);
}
