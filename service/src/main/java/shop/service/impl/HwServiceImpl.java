package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import shop.bean.Hw;
import shop.dao.HwDao;
import shop.service.HwService;

import java.util.List;

@Service
public class HwServiceImpl implements HwService {
	
	@Autowired
	private HwDao hd;

	@Override
	public List sp(Hw hw) {
		// TODO Auto-generated method stub
		return hd.sp(hw);
	}

	@Override
	public int spxj(Hw hw) {
		// TODO Auto-generated method stub
		return hd.spxj(hw);
	}

	@Override
	public int xjrk(Hw hw) {
		// TODO Auto-generated method stub
		return hd.xjrk(hw);
	}

	public Hw dy(int id) {
		// TODO Auto-generated method stub
		return hd.dy(id);
	}

	@Override
	public int ckkk(Hw hw) {
		// TODO Auto-generated method stub
		return hd.ckkk(hw);
	}

	@Override
	public Hw dys(String name) {
		// TODO Auto-generated method stub
		return hd.dys(name);
	}

	@Override
	public int jj(int id) {
		// TODO Auto-generated method stub
		return hd.jj(id);
	}

	@Override
	public int updateHw(Hw hw) {
		// TODO Auto-generated method stub
		return hd.updateHw(hw);
	}

	
	
}
