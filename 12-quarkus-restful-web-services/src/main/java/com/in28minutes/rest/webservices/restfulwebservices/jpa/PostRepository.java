package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import com.in28minutes.rest.webservices.restfulwebservices.user.Post;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * In Quarkus, Spring Data JPA is replaced by Panache for simpler repository management. <br/>
 * Since PanacheRepository assumes Long as the default ID type, use PanacheRepositoryBase<Post, Integer> if your ID is Integer.<br/>
 * <a href="https://quarkus.io/guides/hibernate-orm-panache#defining-your-repository">PanacheRepositoryBase</a>
 */
@ApplicationScoped // Use @ApplicationScoped to make it a CDI bean.
public class PostRepository implements PanacheRepositoryBase<Post, Integer> {

}