package com.in28minutes.rest.webservices.restfulwebservices.versioning

/**
 * A data class representing a person with a single `name` field.
 *
 * @property name A read-only (`val`) property storing the person's full name.
 *
 * - This is a **data class**, which automatically provides:
 *   - `toString()`
 *   - `equals()`
 *   - `hashCode()`
 *   - `copy()`
 * - The constructor parameter (`val name`) is automatically assigned as a property of the class.
 */
data class PersonV2(val name: Name)


// Alternative approach using a regular class:

// /**
//  * A standard class representing a person with a single `name` field.
//  *
//  * @constructor Primary constructor with a private property (`name`).
//  * This property is not accessible outside the class directly.
//  */
//class PersonV2(private val name: Name) {
//
//    // Explicit getter for serialization
//    fun getName(): Name = name
//
//    override fun toString(): String {
//        return "PersonV2 [name=$name]"
//    }
//}

