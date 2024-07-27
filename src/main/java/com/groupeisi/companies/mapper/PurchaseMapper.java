package com.groupeisi.companies.mapper;

import java.util.List;
import com.groupeisi.companies.dto.PurchaseDto;
import com.groupeisi.companies.entities.PurchaseEntity;

public class PurchaseMapper {

	private PurchaseMapper() {

	}

	public static PurchaseEntity toPurchaseEntity(PurchaseDto PurchaseDto) {

		PurchaseEntity PurchaseEntity = new PurchaseEntity();

		PurchaseEntity.setDate(PurchaseDto.getDate());
		PurchaseEntity.setQuantity(PurchaseDto.getQuantity());

		return PurchaseEntity;
	}

	public static PurchaseDto toPurchaseDto(PurchaseEntity PurchaseEntity) {

		PurchaseDto PurchaseDto = new PurchaseDto();

		PurchaseDto.setDate(PurchaseEntity.getDate());
		PurchaseDto.setQuantity(PurchaseEntity.getQuantity());

		return PurchaseDto;
	}

	public static List<PurchaseDto> toListPurchaseDto(List<PurchaseEntity> PurchaseEntity) {

		return PurchaseEntity.stream().map(PurchaseMapper::toPurchaseDto).toList();
	}

}
