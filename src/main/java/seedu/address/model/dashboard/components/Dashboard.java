package seedu.address.model.dashboard.components;

import javafx.concurrent.Task;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents a dashboard in Duke Cooks.
 * Guarantees: details are present and not null, field values validated and immutable.
 */
public class Dashboard {

    // Identity fields
    private final DashboardName dashboardName;

    // Data fields
    private final TaskDate taskDate;

    /**
     * Every field must be present and not null.
     */
    public Dashboard(DashboardName dashboardName, TaskDate taskDate) {
        requireAllNonNull(dashboardName, taskDate);
        this.dashboardName = dashboardName;
        this.taskDate = taskDate;
    }

    public DashboardName getDashboardName() {
        return dashboardName;
    }

    public TaskDate getTaskDate() {
        return taskDate;
    }

    /**
     * Returns true if both todos of the same todoName have at least one other identity field that is the same.
     * This defines a weaker notion of equality between two todos.
     */
    public boolean isSameDashboard(Dashboard otherDashboard) {
        if (otherDashboard == this) {
            return true;
        }

        return otherDashboard != null
                && otherDashboard.getDashboardName().equals(getDashboardName());
    }


    /**
     * Returns true if both todos have the same identity and data fields.
     * This defines a stronger notion of equality between two todos.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Dashboard)) {
            return false;
        }

        Dashboard otherDashboard = (Dashboard) other;
        return otherDashboard.getDashboardName().equals(getDashboardName())
                && otherDashboard.getTaskDate().equals(getTaskDate());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(dashboardName, taskDate);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getDashboardName())
                .append(" Date: ").append(getTaskDate());
        return builder.toString();
    }

}