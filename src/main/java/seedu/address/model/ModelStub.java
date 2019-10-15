package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;

import seedu.address.commons.core.GuiSettings;
import seedu.address.model.person.Person;
import seedu.address.model.recipe.Recipe;
import seedu.address.model.records.Record;

/**
 * A default model stub that have all of the methods failing.
 */
public class ModelStub implements Model {
    @Override
    public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyUserPrefs getUserPrefs() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public GuiSettings getGuiSettings() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setGuiSettings(GuiSettings guiSettings) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public Path getRecipesFilePath() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setRecipesFilePath(Path recipesFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addRecipe(Recipe recipe) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setRecipeBook(ReadOnlyRecipeBook recipeBook) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyRecipeBook getRecipeBook() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public boolean hasRecipe(Recipe recipe) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void deleteRecipe(Recipe target) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setRecipe(Recipe target, Recipe editedRecipe) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Recipe> getFilteredRecipeList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredRecipeList(Predicate<Recipe> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public Path getUserProfileFilePath() {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public Path getHealthRecordsFilePath() {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public void setUserProfileFilePath(Path userProfileFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setHealthRecordsFilePath(Path healthRecordsFilePath) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void addPerson(Person person) {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public void addRecord(Record record) {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public void setUserProfile(ReadOnlyUserProfile userProfile) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setHealthRecords(ReadOnlyHealthRecords healthRecords) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ReadOnlyUserProfile getUserProfile() {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public ReadOnlyHealthRecords getHealthRecords() {
        throw new AssertionError(
                "This method should not be called.");
    }

    @Override
    public void setPerson(Person target, Person editedPerson) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void setRecord(Record target, Record editedRecord) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Person> getFilteredPersonList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public ObservableList<Record> getFilteredRecordList() {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredPersonList(Predicate<Person> predicate) {
        throw new AssertionError("This method should not be called.");
    }

    @Override
    public void updateFilteredRecordList(Predicate<Record> predicate) {
        throw new AssertionError("This method should not be called.");
    }
}