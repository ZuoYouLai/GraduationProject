package sy.dao;

import sy.model.student;

public interface studentMapper {
    int insert(student record);

    int insertSelective(student record);
}