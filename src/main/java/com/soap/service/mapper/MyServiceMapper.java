package com.soap.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.soap.type.Product;

@Mapper
public interface MyServiceMapper {
	public static MyServiceMapper mapper = Mappers.getMapper(MyServiceMapper.class);

	Product map(com.soap.service.model.Product request);
}
