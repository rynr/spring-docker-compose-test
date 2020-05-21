# RemoteGames Status

## Requirements

 - [`docker`](https://www.docker.com/)
 - [`docker-compose`](https://docs.docker.com/compose/)
 - Any [editor](https://en.wikipedia.org/wiki/Source-code_editor) or
   [IDE](https://en.wikipedia.org/wiki/Integrated_development_environment)
   (like [Visual Studio Code][code], [Eclipse][eclipse], [Emacs][emacs],
   [IntelliJ][IntelliJ], [MonoDevelop][MonoDevelop], [Netbeans][Netbeans],
   [Vim][vim], …).

## Development

Just run `docker-compose up` in the directory of the project.

Example output (shortened):

```
$ docker-compose up
spring-docker-compose-test_web_1 ... done
spring-docker-compose-test_proxy_1 ... done
spring-docker-compose-test_redis_1 ... done
spring-docker-compose-test_api_1 ... done
api_1    | [INFO] Scanning for projects...
api_1    | [INFO]
api_1    | [INFO] ----------------------< net.remote-games:status >-----------------------
api_1    | [INFO] Building status 0.0.1-SNAPSHOT
api_1    | [INFO] --------------------------------[ jar ]---------------------------------
api_1    | [INFO]
api_1    | [INFO] --- spring-boot-maven-plugin:2.3.0.RELEASE:run (default-cli) @ status ---
api_1    | [INFO] Attaching agents: []
api_1    | 2020-05-21 07:46:23.502  INFO 40 --- [  restartedMain] n.remotegames.status.StatusApplication   : Starting StatusApplication on 015dc8e10bc3 with PID 40 (/app/target/classes started by root in /app)
api_1    | 2020-05-21 07:46:23.505  INFO 40 --- [  restartedMain] n.remotegames.status.StatusApplication   : No active profile set, falling back to default profiles: default
api_1    | 2020-05-21 07:46:23.569  INFO 40 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
api_1    | 2020-05-21 07:46:24.621  INFO 40 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
api_1    | 2020-05-21 07:46:26.025  INFO 40 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
api_1    | 2020-05-21 07:46:26.127  INFO 40 --- [  restartedMain] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port(s): 8080
api_1    | 2020-05-21 07:46:26.163  INFO 40 --- [  restartedMain] n.remotegames.status.StatusApplication   : Started StatusApplication in 3.201 seconds (JVM running for 4.042)
redis_1  | 1:C 21 May 2020 07:05:10.725 # oO0OoO0OoO0Oo Redis is starting oO0OoO0OoO0Oo
redis_1  | 1:C 21 May 2020 07:05:10.725 # Redis version=6.0.3, bits=64, commit=00000000, modified=0, pid=1, just started
redis_1  | 1:M 21 May 2020 07:05:10.726 * Running mode=standalone, port=6379.
redis_1  | 1:M 21 May 2020 07:05:10.726 # Server initialized
web_1    | yarn install v1.22.4
web_1    | [1/4] Resolving packages...
web_1    | success Already up-to-date.
web_1    | Done in 0.61s.
web_1    | yarn run v1.22.4
web_1    | $ ng serve --host 0.0.0.0
web_1    |
web_1    | chunk {main} main.js, main.js.map (main) 60.6 kB [initial] [rendered]
web_1    | chunk {polyfills} polyfills.js, polyfills.js.map (polyfills) 141 kB [initial] [rendered]
web_1    | chunk {runtime} runtime.js, runtime.js.map (runtime) 6.15 kB [entry] [rendered]
web_1    | chunk {styles} styles.js, styles.js.map (styles) 12.7 kB [initial] [rendered]
web_1    | chunk {vendor} vendor.js, vendor.js.map (vendor) 3 MB [initial] [rendered]
web_1    | Date: 2020-05-21T08:08:46.541Z - Hash: 1488dd0a0d03cdce2200 - Time: 7384ms
web_1    | ** Angular Live Development Server is listening on 0.0.0.0:4200, open your browser on http://localhost:4200/ **
web_1    | : Compiled successfully.
```

You can now access the application at [`http://localhost/`](http://localhost/).

Any change on the code base will automatically be updated on the started service.


[code]: https://code.visualstudio.com/
[eclipse]: http://www.eclipse.org/
[emacs]: https://www.gnu.org/software/emacs/
[IntelliJ]: https://www.jetbrains.com/de-de/idea/
[MonoDevelop]: https://www.monodevelop.com/
[Netbeans]: https://netbeans.org/
[vim]: https://www.vim.org/
