package tech.adriano.hexagonal.service.core.domain.entity;

import java.util.Objects;
import java.util.StringJoiner;

import tech.adriano.hexagonal.service.core.domain.valueobject.Name;
import io.micronaut.http.annotation.Get;

/**
 * The User core domain
 */
public class User extends Entity {
	
	private Name name;
	
	
	public User(ManagedId id, Name name) {
		super(id);
		this.name = name;
	}
	
	@Get
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	
	public Name getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
				.add("name=" + name)
				.toString();
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(name, user.name);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	
	public static class UserBuilder {
		
		private ManagedId id;
		private Name name;
		
		
		public UserBuilder id(ManagedId id) {
			this.id = id;
			return this;
		}
		
		
		public UserBuilder name(Name name) {
			this.name = name;
			return this;
		}
		
		
		public User build() {
			return new User(id, name);
		}
		
		
		private UserBuilder() {
		}
	}
}
