package dukecooks.ui;

import dukecooks.model.dashboard.components.Dashboard;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

/**
 * An UI component that displays information of a {@code Dashboard}.
 */
public class DashboardCard extends UiPart<Region> {

    private static final String FXML = "DashboardListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Dashboard dashboard;

    @FXML
    private HBox cardPane;
    @FXML
    private Label dashboardName;
    @FXML
    private Label id;
    @FXML
    private Label taskDate;
    @FXML
    private Label taskStatus;

    public DashboardCard(Dashboard dashboard, int displayedIndex) {
        super(FXML);
        this.dashboard = dashboard;
        id.setText(displayedIndex + ". ");
        dashboardName.setText(dashboard.getDashboardName().fullName);
        taskDate.setText(dashboard.getTaskDate().taskDate);
        taskStatus.setText(dashboard.getTaskStatus().taskStatus);
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
        DashboardCard card = (DashboardCard) other;
        return id.getText().equals(card.id.getText())
                && dashboard.equals(card.dashboard);
    }
}
