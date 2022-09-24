package top.misec.webhooks.component;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Moshi
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class ThreadService {


    @Async("asyncServiceExecutor")
    public CompletableFuture<?> asyncTest(String vars) {

        try {
            return CompletableFuture.completedFuture(null);
        } catch (Exception e) {
            log.error("vars-", e);
        }
        return CompletableFuture.completedFuture(null);
    }


}
