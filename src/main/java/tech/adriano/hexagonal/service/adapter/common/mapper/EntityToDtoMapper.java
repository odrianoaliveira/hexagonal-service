package tech.adriano.hexagonal.service.adapter.common.mapper;

public interface EntityToDtoMapper<Entity, DTO> {
	
	Entity mapToEntity(DTO source);
	
	DTO mapToDto(Entity source);
	
}
