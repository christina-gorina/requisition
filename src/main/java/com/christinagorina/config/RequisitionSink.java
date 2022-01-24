package com.christinagorina.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RequisitionSink {

    String INPUT = "inputRequisition";

    @Input
    SubscribableChannel inputRequisition();

}
