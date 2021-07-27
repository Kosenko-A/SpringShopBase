package ru.geekbrains.SpringShopBase.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.geekbrains.SpringShopBase.dto.ProductDto;
import ru.geekbrains.SpringShopBase.entity.Product;

@Mapper
public interface ProductDtoMapper {

    ProductDtoMapper MAPPER = Mappers.getMapper(ProductDtoMapper.class);

    @Mapping(target = "name", source = "productDto.name")
    Product toProduct(ProductDto productDto);
}
