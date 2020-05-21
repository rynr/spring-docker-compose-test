package net.remotegames.status;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/version")
public class VersionController {

  public Mono<String> version() {
    return Mono.just("Hello World");
  }
}
