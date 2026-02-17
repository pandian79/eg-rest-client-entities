package com.eg.api.client.entity;

import java.util.List;

public class TestAlarmHistoryRequestBody {
    public static void main(String[] args) {
        System.out.println("--- Test 1: Example to retrieve History of Alarms ---");
        AlarmHistoryRequestBody r1 = new AlarmHistoryRequestBody();
        r1.setComponentName("172.16.10.90:443");
        r1.setComponentType("eG Manager");
        r1.setStartDate("Aug 30, 2021 22:00:00");
        r1.setEndDate("Aug 31, 2021 1:00:00");
        r1.setPriority("");
        r1.setOrderby("Component Name");
        r1.setShowAcknowledgements("No");

        printValidation(r1);

        System.out.println("--- Test 2: Example with timeline=Any ---");
        AlarmHistoryRequestBody r2 = new AlarmHistoryRequestBody();
        r2.setComponentName("172.16.10.90:443");
        r2.setComponentType("eG Manager");
        r2.setTimeline("Any");
        r2.setStartDate("Aug 30, 2021 22:00:00");
        r2.setEndDate("Aug 31, 2021 1:00:00");
        r2.setPriority("");
        r2.setOrderby("Component Name");
        r2.setShowAcknowledgements("No");

        printValidation(r2);

        System.out.println("--- Test 3: Invalid dates and fields ---");
        AlarmHistoryRequestBody r3 = new AlarmHistoryRequestBody();
        r3.setComponentName("host:1234");
        r3.setComponentType("SomeType");
        r3.setTimeline("5 lightyears"); // invalid
        r3.setStartDate("2021-08-30 22:00:00"); // invalid format
        r3.setEndDate("Aug 29, 2021 21:00:00"); // end before start
        r3.setPriority("Unknown");
        r3.setOrderby("FooBar");
        r3.setShowAcknowledgements("Maybe");

        printValidation(r3);
    }

    private static void printValidation(AlarmHistoryRequestBody r) {
        List<String> errors = r.validate();
        System.out.println("Request: " + r);
        if (errors.isEmpty()) {
            System.out.println("Validation: OK\n");
        } else {
            System.out.println("Validation errors:");
            for (String e : errors) {
                System.out.println(" - " + e);
            }
            System.out.println();
        }
    }
}
