package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.userMapper;
import sy.model.user;
@Service("userService")
public class UserServiceImpl implements UserServiceI{
	
	private userMapper usmapper;
	
	
	public userMapper getUsmapper() {
		return usmapper;
	}


	@Autowired
	public void setUsmapper(userMapper usmapper) {
		this.usmapper = usmapper;
	}



	@Override
	public user getUserById(String id) {
		return usmapper.selectByPrimaryKey(id);
	}

}
