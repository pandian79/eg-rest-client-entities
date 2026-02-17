package com.eg.api.client.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Request body for fetching alarm history. Holds optional parameters described by the user.
 *
 * Assumptions made:
 * - All fields are optional by default. If you want some fields to be compulsory (for example
 *   componentName or componentType), tell me and I'll enforce those rules.
 * - Dates must follow the pattern: "MMM d, yyyy HH:mm:ss" (example: "Aug 30, 2021 22:00:00").
 */
public class AlarmHistoryRequestBody {

    private String componentType;
    private String componentName;
    private String timeline; // e.g. "Any" or "5 hours" or "hours"
    private String orderby; // "Start Time" or "Component Name"
    private String showAcknowledgements; // "Yes" or "No"
    private String priority; // "All", "Critical & Major", "Critical", "Major", "Minor", or empty
    private String startDate; // expected format: "MMM d, yyyy HH:mm:ss"
    private String endDate;   // expected format: "MMM d, yyyy HH:mm:ss"

    public static final String DATE_PATTERN = "MMM d, yyyy HH:mm:ss";
    private static final Pattern TIMELINE_PATTERN = Pattern.compile("(?i)^(?:Any|\\d+\\s*(?:minutes?|hours?|days?|weeks?)|(?:minutes?|hours?|days?|weeks?))$");
    private static final List<String> ORDER_BY_ALLOWED = Arrays.asList("Start Time", "Component Name");
    private static final List<String> SHOW_ACK_ALLOWED = Arrays.asList("Yes", "No");
    private static final List<String> PRIORITY_ALLOWED = Arrays.asList("All", "Critical & Major", "Critical", "Major", "Minor", "");

    public AlarmHistoryRequestBody() {
    }

    // getters and setters
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }

    public String getShowAcknowledgements() {
        return showAcknowledgements;
    }

    public void setShowAcknowledgements(String showAcknowledgements) {
        this.showAcknowledgements = showAcknowledgements;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /*
     * Validate the request object. Returns a list of validation error messages. If the list is empty,
     * the request is considered valid.
     */
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        // timeline validation
        if (!isNullOrEmpty(timeline)) {
            if (!TIMELINE_PATTERN.matcher(timeline.trim()).matches()) {
                errors.add("Invalid timeline. Allowed values: 'Any' or formats like '5 hours', 'hours', '30 minutes', '2 days', '1 week'.");
            }
        }

        // orderby validation
        if (!isNullOrEmpty(orderby)) {
            boolean ok = ORDER_BY_ALLOWED.stream().anyMatch(a -> a.equalsIgnoreCase(orderby.trim()));
            if (!ok) {
                errors.add("Invalid orderby. Allowed values: 'Start Time', 'Component Name'.");
            }
        }

        // showAcknowledgements validation
        if (!isNullOrEmpty(showAcknowledgements)) {
            boolean ok = SHOW_ACK_ALLOWED.stream().anyMatch(a -> a.equalsIgnoreCase(showAcknowledgements.trim()));
            if (!ok) {
                errors.add("Invalid showAcknowledgements. Allowed values: 'Yes' or 'No'.");
            }
        }

        // priority validation
        if (!isNullOrEmpty(priority)) {
            boolean ok = PRIORITY_ALLOWED.stream().anyMatch(a -> a.equalsIgnoreCase(priority.trim()));
            if (!ok) {
                errors.add("Invalid priority. Allowed values: 'All', 'Critical & Major', 'Critical', 'Major', 'Minor' or empty string.");
            }
        }

        // date format validation
        Date start = null;
        Date end = null;
        if (!isNullOrEmpty(startDate)) {
            try {
                start = parseDate(startDate.trim());
            } catch (ParseException e) {
                errors.add("startDate must follow the pattern 'MMM d, yyyy HH:mm:ss' e.g. 'Aug 30, 2021 22:00:00'.");
            }
        }

        if (!isNullOrEmpty(endDate)) {
            try {
                end = parseDate(endDate.trim());
            } catch (ParseException e) {
                errors.add("endDate must follow the pattern 'MMM d, yyyy HH:mm:ss' e.g. 'Aug 31, 2021 01:00:00'.");
            }
        }

        // date ordering validation
        if (start != null && end != null) {
            if (start.after(end)) {
                errors.add("startDate must be before or equal to endDate.");
            }
        }

        // Example compulsory-field check placeholder: currently none enforced.
        // If you want componentName or componentType to be required, enable the checks below.
        // if (isNullOrEmpty(componentName)) {
        //     errors.add("componentName is required.");
        // }
        // if (isNullOrEmpty(componentType)) {
        //     errors.add("componentType is required.");
        // }

        return errors;
    }

    public boolean isValid() {
        return validate().isEmpty();
    }

    public void validateOrThrow() {
        List<String> errors = validate();
        if (!errors.isEmpty()) {
            throw new IllegalArgumentException("AlarmHistoryRequestBody validation failed: " + String.join("; ", errors));
        }
    }

    private static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    private static Date parseDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN, Locale.ENGLISH);
        sdf.setLenient(false);
        return sdf.parse(s);
    }

    @Override
    public String toString() {
        return "AlarmHistoryRequestBody{" +
                "componentType='" + componentType + '\'' +
                ", componentName='" + componentName + '\'' +
                ", timeline='" + timeline + '\'' +
                ", orderby='" + orderby + '\'' +
                ", showAcknowledgements='" + showAcknowledgements + '\'' +
                ", priority='" + priority + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlarmHistoryRequestBody that = (AlarmHistoryRequestBody) o;
        return Objects.equals(componentType, that.componentType) &&
                Objects.equals(componentName, that.componentName) &&
                Objects.equals(timeline, that.timeline) &&
                Objects.equals(orderby, that.orderby) &&
                Objects.equals(showAcknowledgements, that.showAcknowledgements) &&
                Objects.equals(priority, that.priority) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentType, componentName, timeline, orderby, showAcknowledgements, priority, startDate, endDate);
    }
}