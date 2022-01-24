package com.christinagorina.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.listener.AbstractMessageListenerContainer;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;
import org.springframework.util.backoff.FixedBackOff;

//TODO надо нет?
//@Configuration
@EnableBinding({RequisitionSource.class, RequisitionSink.class})
public class StreamConfiguration {

    //TODO для чего
    //@Bean
    //ListenerContainerCustomizer<AbstractMessageListenerContainer<?, ?>> customizer() {
    //    return ((container, destinationName, group) -> {
    //        container.setErrorHandler(new SeekToCurrentErrorHandler(new FixedBackOff(5000, 1)));
     //   });
   //}
}
