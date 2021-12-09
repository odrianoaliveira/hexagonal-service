package tech.adriano.hexagonal.service.adapter.rest.controller;


import tech.adriano.hexagonal.service.adapter.rest.dto.UserResource;
import tech.adriano.hexagonal.service.adapter.rest.mapper.UserToUserResource;
import tech.adriano.hexagonal.service.core.domain.entity.User;
import tech.adriano.hexagonal.service.core.usecase.CreateUser;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/hexa-service")
public class UserResourceController {

    private final CreateUser createUser;
    private final UserToUserResource userToUserResource;


    @Inject
    public UserResourceController(CreateUser createUser, UserToUserResource userToUserResource) {
        this.createUser = createUser;
        this.userToUserResource = userToUserResource;
    }

    @Post(consumes = MediaType.APPLICATION_JSON)
    public UserResource createUser(@Body UserResource userResource) {
        User user = userToUserResource.mapToEntity(userResource);
        User createdUser = createUser.create(user);
        return userToUserResource.mapToDto(createdUser);
    }
}
