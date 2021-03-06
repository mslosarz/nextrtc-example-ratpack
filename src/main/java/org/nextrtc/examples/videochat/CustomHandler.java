package org.nextrtc.examples.videochat;

import org.nextrtc.signalingserver.api.NextRTCEvents;
import org.nextrtc.signalingserver.api.NextRTCHandler;
import org.nextrtc.signalingserver.api.annotation.NextRTCEventListener;
import org.nextrtc.signalingserver.api.dto.NextRTCEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NextRTCEventListener({NextRTCEvents.SESSION_OPENED, NextRTCEvents.MEMBER_JOINED, NextRTCEvents.MEMBER_LEFT})
class CustomHandler implements NextRTCHandler {
    private static final Logger log = LoggerFactory.getLogger(CustomHandler.class);

    @Override
    public void handleEvent(NextRTCEvent event) {
        log.info("REACTION ON EVENT:" + event);
    }
}
