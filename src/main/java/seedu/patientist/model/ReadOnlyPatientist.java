package seedu.patientist.model;

import javafx.collections.ObservableList;
import seedu.patientist.model.person.Person;

/**
 * Unmodifiable view of an patientist book
 */
public interface ReadOnlyPatientist {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

}