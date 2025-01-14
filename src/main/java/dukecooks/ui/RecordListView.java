package dukecooks.ui;

import dukecooks.model.health.components.Record;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

/**
 * An UI component that displays information of a {@code Record}.
 */
public class RecordListView extends UiPart<Region> {

    private static final String FXML = "RecordListView.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable recordIds cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Record record;

    @FXML
    private HBox cardPane;
    @FXML
    private Label id;
    @FXML
    private Label timestamp;
    @FXML
    private Label value;

    public RecordListView(Record record, int displayedIndex) {
        super(FXML);
        this.record = record;
        id.setText(displayedIndex + ". ");
        timestamp.setText(record.getTimestamp().timestamp);
        value.setText(record.getValue().value + record.getType().unit);
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof RecordListView)) {
            return false;
        }

        // state check
        RecordListView card = (RecordListView) other;
        return id.getText().equals(card.id.getText())
                && record.equals(card.record);
    }
}
