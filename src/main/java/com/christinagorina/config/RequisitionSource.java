package com.christinagorina.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface RequisitionSource {

    String OUTPUT = "outputRequisition";

    @Output
    MessageChannel outputRequisition();
}
