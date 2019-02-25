package com.personal.weatherservice.endpoints;

import com.nike.riposte.server.http.ProxyRouterEndpoint;
import com.nike.riposte.server.http.RequestInfo;
import com.nike.riposte.server.http.impl.SimpleProxyRouterEndpoint;
import com.nike.riposte.util.Matcher;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Named;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpResponse;


class ProxyEndpoint(z: com.nike.riposte.util.Matcher, x: java.lang.String, c: Int, v: java.lang.String, b: Boolean) extends SimpleProxyRouterEndpoint(z,x,c,v,b) {

  def this() = this(Matcher.`match`("/exampleProxy"), "api.weather.gov", 443, "/gridpoints/TOP/31,80/forecast", true)

}
