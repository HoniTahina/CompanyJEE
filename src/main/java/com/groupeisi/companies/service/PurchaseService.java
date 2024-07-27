package com.groupeisi.companies.service;

import java.util.List;
import java.util.Optional;

import com.groupeisi.companies.dao.IPurchaseDao;
import com.groupeisi.companies.dao.PurchaseDao;
import com.groupeisi.companies.dto.PurchaseDto;
public class PurchaseService implements IPurchaseService {

	private IPurchaseDao purchaseDao = new PurchaseDao();

	public void setPurchaseDao(IPurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}

	@Override
	public boolean save(PurchaseDto purchaseDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<List<PurchaseDto>> findAll() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
