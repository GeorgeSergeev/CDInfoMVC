package com.github.GeorgeSergeev.CDInfoMVC.dao;

import java.util.List;
import com.github.GeorgeSergeev.CDInfoMVC.domain.CDEntity;;

public interface CDinfoDAO {
	public void addCD(CDEntity newCD);
	public List <CDEntity> listCD();	
}
