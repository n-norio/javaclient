package biz.all_rounder.javaclient.dao;

import org.springframework.data.repository.CrudRepository;

import biz.all_rounder.javaclient.entity.Sample;

public interface SampleDao extends CrudRepository<Sample, Long> {

}
