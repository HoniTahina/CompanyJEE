package com.groupeisi.companies.mapper;

import java.util.List;
import com.groupeisi.companies.dto.SaleDto;
import com.groupeisi.companies.entities.SaleEntity;

public class SaleMapper {

	private SaleMapper() {

	}

	public static SaleEntity toSaleEntity(SaleDto SaleDto) {

		SaleEntity SaleEntity = new SaleEntity();

		SaleEntity.setDate(SaleDto.getDate());
		SaleEntity.setQuantity(SaleDto.getQuantity());

		return SaleEntity;
	}

	public static SaleDto toSaleDto(SaleEntity SaleEntity) {

		SaleDto SaleDto = new SaleDto();

		SaleDto.setDate(SaleEntity.getDate());
		SaleDto.setQuantity(SaleEntity.getQuantity());

		return SaleDto;
	}

	public static List<SaleDto> toListSaleDto(List<SaleEntity> SaleEntity) {

		return SaleEntity.stream().map(SaleMapper::toSaleDto).toList();
	}

}
