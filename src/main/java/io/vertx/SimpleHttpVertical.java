package io.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

/**
 * Created by alberto on 3/11/17.
 */
public class SimpleHttpVertical extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) {

        // Create a router object.
        Router router = Router.router(vertx);

        // Bind "/" to our hello message - so we are still compatible.
        router.route("/").handler(routingContext -> {
            HttpServerResponse response = routingContext.response();
            response
                    .putHeader("content-type", "text/html")
                    .end("<h1>Hello from my first Vert.x 3 application</h1>");
        });

        vertx
                .createHttpServer()
                .requestHandler(router::accept)
                .listen(
                // Retrieve the port from the configuration,
                // default to 8080. .listen(8080,
                config().getInteger("http.port", 8080),
                 result -> {
                    if (result.succeeded()) {
                        startFuture.complete();
                    } else {
                        startFuture.fail(result.cause());
                    }
                });
    }
}
