package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;

/**
 * In Quarkus, Spring Data JPA is replaced by Panache for simpler repository management.<br/>
 * Since PanacheRepository assumes Long as the default ID type, use PanacheRepositoryBase<User, Integer> if your ID is Integer. <br/>
 * <a href="https://quarkus.io/guides/hibernate-orm-panache#defining-your-repository">PanacheRepositoryBase</a>
 */
@ApplicationScoped // Use @ApplicationScoped to make it a CDI bean.
public class UserRepository implements PanacheRepositoryBase<User, Integer> {
}

