package com.groupeisi.companies.service;

import java.util.List;
import java.util.Optional;

import com.groupeisi.companies.dao.ISaleDao;
import com.groupeisi.companies.dao.SaleDao;
import com.groupeisi.companies.dto.SaleDto;

public class SaleService implements ISaleService {

	private ISaleDao saleDao = new SaleDao();

	public void setSaleDao(ISaleDao saleDao) {
		this.saleDao = saleDao;
	}

	@Override
	public Optional<List<SaleDto>> findAll() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean save(SaleDto saleDto) {
		// TODO Auto-generated method stub
		return false;
	}

}
