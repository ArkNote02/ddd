import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

@Slf4j
public class WebFluxTest {

//  int loopCount = 200;
//
//  @Test
//  void nonBlocking() throws InterruptedException {
//    call("/non-blocking" , loopCount);
//  }
//
//  @Test
//  void blocking() throws InterruptedException {
//    call("/blocking", loopCount);
//  }
//
//  void call(String path, int loopCount) throws InterruptedException {
//
//    WebClient web = WebClient.create("http://localhost:8080");
//    RequestHeadersSpec<?> request = web.get().uri(path).header("Connection", "close");
//    AbstractStringAssert<?> assertResponse = assertThat("OK");
//    CountDownLatch latch = new CountDownLatch(loopCount);
//
//    long start = System.currentTimeMillis();
//    for (int i = 0; i < loopCount; i++) {
//      request
//          .retrieve()
//          .bodyToMono(String.class)
//          .doOnError(Assertions::fail)
//          .doOnTerminate(latch::countDown)
//          .subscribe(assertResponse::isEqualTo);
//    }
//    latch.await(1, TimeUnit.MINUTES);
//    log.info(path + " " + (System.currentTimeMillis() - start) + "ms");
//  }
}
