package biz.all_rounder.javaclient.sample;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biz.all_rounder.javaclient.dao.SampleDao;
import biz.all_rounder.javaclient.entity.Sample;

@Service
@Transactional
public class SampleService {

	@Autowired
	private SampleDao sampleDao;
	
	public void findSample() {
		Iterable<Sample> ite = sampleDao.findAll();
		System.out.println(ite.iterator().next().getName());
		
	}
	
	public void insertTestData() {
		Sample sample = new Sample();
		sample.setName("test1");
		sample.setPrice(new BigDecimal(100));
		sampleDao.save(sample);
	}
}
