package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import shop.bean.Sh;
import shop.dao.ShDao;
import shop.service.ShService;

import java.util.List;

@Service
public class ShServiceImpl implements ShService {

	@Autowired
	private ShDao sd;

	@Override
	public int ck(Sh sh) {
		// TODO Auto-generated method stub
		return sd.ck(sh);
	}

	@Override
	public int cksh(Sh sh) {
		// TODO Auto-generated method stub
		return sd.cksh(sh);
	}

	@Override
	public int jj(int id) {
		// TODO Auto-generated method stub
		return sd.jj(id);
	}

	@Override
	public List cc(int sh) {
		// TODO Auto-generated method stub
		return sd.cc(sh);
	}

	@Override
	public List  bb() {
		// TODO Auto-generated method stub
		return sd.bb();
	}

	@Override
	public List  hws(String hw) {
		// TODO Auto-generated method stub
		return sd.hws(hw);
	}

	@Override
	public Sh hwss(int id) {
		// TODO Auto-generated method stub
		return sd.hwss(id);
	}

	@Override
	public List bbs() {
		// TODO Auto-generated method stub
		return sd.bbs();
	}
	
	
	
}
