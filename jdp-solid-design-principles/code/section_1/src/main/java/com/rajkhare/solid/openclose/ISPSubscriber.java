package com.rajkhare.solid.openclose;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    public ISPSubscriber() {

    }

    // Open - for extension
    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }


}