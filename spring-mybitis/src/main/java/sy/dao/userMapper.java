package sy.dao;

import sy.model.user;

public interface userMapper {
    int deleteByPrimaryKey(String id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}