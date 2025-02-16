package dukecooks.ui;

import dukecooks.model.diary.components.Diary;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

/**
 * An UI component that displays information of a {@code Diary}.
 */
public class DiaryCard extends UiPart<Region> {

    private static final String FXML = "DiaryListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Diary diary;

    @FXML
    private HBox cardPane;
    @FXML
    private Label diaryName;
    @FXML
    private Label id;
    @FXML
    private FlowPane pages;

    public DiaryCard(Diary diary, int displayedIndex) {
        super(FXML);
        this.diary = diary;
        id.setText(displayedIndex + ". ");
        diaryName.setText(diary.getDiaryName().fullName);

        diary.getPages().stream()
                .forEach(page -> pages.getChildren().add(new Label(page.getTitle().toString())));
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof DiaryCard)) {
            return false;
        }

        // state check
        DiaryCard card = (DiaryCard) other;
        return id.getText().equals(card.id.getText())
                && diary.equals(card.diary);
    }
}
