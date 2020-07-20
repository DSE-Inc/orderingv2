package net.works;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.works.entity.Site;
import java.util.List;

import net.works.repository.SiteRepository;

@Service
@Transactional
public class SiteService {

	@Autowired
	private SiteRepository repo;
	
	public List<Site> listAll(){
		return repo.findAll();
	}
}
