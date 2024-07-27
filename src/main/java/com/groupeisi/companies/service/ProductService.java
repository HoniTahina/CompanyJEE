package com.groupeisi.companies.service;

import java.util.List;
import java.util.Optional;

import com.groupeisi.companies.dao.AccountUserDao;
import com.groupeisi.companies.dao.IAccountUserDao;
import com.groupeisi.companies.dao.IProductDao;
import com.groupeisi.companies.dao.ProductDao;
import com.groupeisi.companies.dto.AccountUserDto;
import com.groupeisi.companies.dto.ProductDto;
import com.groupeisi.companies.entities.AccountUserEntity;
import com.groupeisi.companies.entities.ProductEntity;
import com.groupeisi.companies.mapper.AccountUserMapper;

public class ProductService implements IProductService {

	private IProductDao productDao = new ProductDao();

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

		@Override
	public boolean save(ProductDto productDto) {
		// TODO Auto-generated method stub
		return false;
	}

		@Override
		public Optional<List<ProductDto>> findAll() {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public ProductDto getByid(String id, ProductEntity product) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean update(ProductDto productDto) {
			// TODO Auto-generated method stub
			return false;
		}
}
