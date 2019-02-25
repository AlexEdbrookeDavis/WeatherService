package com.personal.weatherservice.endpoints;

import com.nike.backstopper.apierror.sample.SampleCoreApiError;
import com.nike.backstopper.exception.ApiException;
import com.nike.riposte.server.http.RequestInfo;
import com.nike.riposte.server.http.ResponseInfo;
import com.nike.riposte.server.http.StandardEndpoint;
import com.nike.riposte.util.Matcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Named;

import io.netty.channel.ChannelHandlerContext;


class ScalaEndpoint extends StandardEndpoint[Void, String] {
  override def requestMatcher(): Matcher = Matcher.`match`("/hello")

  override def execute(
    request: RequestInfo[Void],
    longRunningTaskExecutor: Executor,
    ctx: ChannelHandlerContext): CompletableFuture[ResponseInfo[String]] =
  {
    CompletableFuture.completedFuture(
      ResponseInfo.newBuilder("Hello, world!")
        .withDesiredContentWriterMimeType("text/plain")
        .build()
    )
  }
}
