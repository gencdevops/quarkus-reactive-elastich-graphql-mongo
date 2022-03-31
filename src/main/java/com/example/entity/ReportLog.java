package com.example.entity;



import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ReportLog extends ReactivePanacheMongoEntity {


    private String id;
    private String level;
    private String thread;
    private String traceId;
    private String spanId;
    private String sessionId;
    private String msisdn;
    private String clientIp;
    private String channel;
    private String language;
    private String source;
    private String message;
    private String reportLogKey;


}
