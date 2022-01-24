package com.christinagorina.model;

import com.christinagorina.config.RequisitionSink;
import com.christinagorina.config.RequisitionSource;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

public class Requisition {

    @StreamListener(RequisitionSink.INPUT)
    @SendTo(RequisitionSource.OUTPUT)
    public Requisition requisitionInput(Requisition message){
        return new Requisition();
    }
}
