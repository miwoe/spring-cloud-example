package de.miwoe.person;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Grauschleier on 25.06.2016.
 */
public interface PersonRepository extends JpaRepository<Person, String> {
}
