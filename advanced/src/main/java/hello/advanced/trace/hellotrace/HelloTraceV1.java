package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloTraceV1 {

    public TraceStatus begin(String message) {
        TraceId traceId = new TraceId();
        Long startTimeMs = System.currentTimeMillis();
        log.info("[{}] {}{}", traceId.getId(), addSpace(), message);
        return new TraceStatus(traceId, startTimeMs, message);
    }

    private Object addSpace() {
    }

    ;
    public void end(TraceStatus status){

    };

    public void exception(TraceStatus status, Exception e){

    }

}
