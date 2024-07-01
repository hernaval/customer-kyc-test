package com.testapp.onboarding_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.testapp.onboarding_service.dto.CustomerApplicationDto;
import com.testapp.onboarding_service.model.CustomerApplication;

@Mapper(componentModel = "spring")
public interface CustomerApplicationMapper {
	
	CustomerApplicationMapper INSTANCE = Mappers.getMapper(CustomerApplicationMapper.class);
	
	CustomerApplication dtoToEntity(CustomerApplicationDto dto);
	CustomerApplicationDto entityToDto(CustomerApplication entity);
}
