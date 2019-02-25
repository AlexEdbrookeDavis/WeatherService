package com.myorg.ripostemicroservicetemplate.endpoints;
import com.personal.weatherservice.endpoints.ProxyEndpoint;

import com.nike.riposte.server.http.ResponseInfo;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import org.junit.Assert._

class ProxyEndpointTest {
    private var proxyEndpoint: ProxyEndpoint  = _

    def testResponse {
        proxyEndpoint = new ProxyEndpoint 
        // when
        var responseFuture: CompletableFuture[ResponseInfo[Void]] = CompletableFuture.completedFuture(ResponseInfo.newBuilder[Void]().withHttpStatusCode(200).build());
        val responseInfo: ResponseInfo[Void] = responseFuture.join();
        // then
        assertEquals(responseInfo.getHttpStatusCode(), 200)
    }
}
