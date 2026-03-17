package dk.ek.gruppe2.chooseyourfate.service;

import dk.ek.gruppe2.chooseyourfate.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.function.Function;

public abstract class CrudService<Entity, Id, ResponseDTO> {

    protected abstract JpaRepository<Entity, Id> getRepository();

    protected abstract Function<Entity, ResponseDTO> toDTOMapper();

    protected abstract String getEntityName();

    public List<ResponseDTO> getAll() {
        return getRepository().findAll()
                .stream()
                .map(toDTOMapper())
                .toList();
    }

    public ResponseDTO getById(Id id) {
        Entity entity = getRepository().findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(getEntityName() + " not found with id: " + id));
        return toDTOMapper().apply(entity);
    }

    public void deleteById(Id id) {
        if (!getRepository().existsById(id)) {
            throw new ResourceNotFoundException(getEntityName() + " not found with id: " + id);
        }
        getRepository().deleteById(id);
    }
}
