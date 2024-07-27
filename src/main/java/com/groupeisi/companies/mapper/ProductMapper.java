package com.groupeisi.companies.mapper;

import java.util.List;
import com.groupeisi.companies.dto.ProductDto;
import com.groupeisi.companies.entities.ProductEntity;

public class ProductMapper {

	private ProductMapper() {

	}

	public static ProductEntity toProductEntity(ProductDto ProductDto) {

		ProductEntity ProductEntity = new ProductEntity();

		ProductEntity.setRef(ProductDto.getRef());
		ProductEntity.setName(ProductDto.getName());
		ProductEntity.setStock(ProductDto.getStock());

		return ProductEntity;
	}

	public static ProductDto toProductDto(ProductEntity ProductEntity) {

		ProductDto ProductDto = new ProductDto();

		ProductDto.setRef(ProductEntity.getRef());
		ProductDto.setName(ProductEntity.getName());
		ProductDto.setStock(ProductEntity.getStock());

		return ProductDto;
	}

	public static List<ProductDto> toListProductDto(List<ProductEntity> ProductEntity) {

		return ProductEntity.stream().map(ProductMapper::toProductDto).toList();
	}

}
