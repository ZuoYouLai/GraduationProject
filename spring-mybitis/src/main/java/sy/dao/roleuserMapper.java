package sy.dao;

import sy.model.roleuserKey;

public interface roleuserMapper {
    int deleteByPrimaryKey(roleuserKey key);

    int insert(roleuserKey record);

    int insertSelective(roleuserKey record);
}