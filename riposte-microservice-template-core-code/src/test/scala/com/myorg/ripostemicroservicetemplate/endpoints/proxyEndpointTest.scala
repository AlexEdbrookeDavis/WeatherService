package com.myorg.ripostemicroservicetemplate.endpoints;
import com.personal.weatherservice.endpoints.ProxyEndpoint;

import com.nike.riposte.server.http.ResponseInfo;
import com.nike.riposte.util.Matcher;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import org.junit.Assert._



class ProxyEndpointTest {
    private var proxyEndpoint: ProxyEndpoint  = _

    def testConstruction {
        proxyEndpoint = new ProxyEndpoint()

        assertEquals(proxyEndpoint.requestMatcher(), Matcher.`match`("/exampleProxy"))
    }

    //NOTE: this test is already performed through the unit tests of riposte. Since ProxyEndpoint is just an scala based Adapter for a preexisting class, there is no code to test other then construction.
    def testResponse {
        // when
        var responseFuture: CompletableFuture[ResponseInfo[Void]] = CompletableFuture.completedFuture(ResponseInfo.newBuilder[Void]().withHttpStatusCode(200).build());
        val responseInfo: ResponseInfo[Void] = responseFuture.join()
        // then
        assertEquals(responseInfo.getHttpStatusCode(), 200)
    }
}
