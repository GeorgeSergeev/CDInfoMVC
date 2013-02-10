package com.github.GeorgeSergeev.CDInfoMVC.service;
import java.util.List;
import com.github.GeorgeSergeev.CDInfoMVC.domain.CDEntity;
public interface CDinfoService {
	public void addCD(CDEntity newCD);
	public List <CDEntity> listCD();	
}
