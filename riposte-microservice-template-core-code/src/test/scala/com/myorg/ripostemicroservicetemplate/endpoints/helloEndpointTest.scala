package com.myorg.ripostemicroservicetemplate.endpoints;
import com.personal.weatherservice.endpoints.ScalaEndpoint;

import com.nike.riposte.server.http.ResponseInfo;
import com.nike.riposte.util.Matcher;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import org.junit.Assert._



class helloEndpointTest {
    private var helloEndpoint: ScalaEndpoint  = _

    def testConstruction {
        helloEndpoint = new ScalaEndpoint()

        assertEquals(helloEndpoint.requestMatcher(), Matcher.`match`("/hello"))
    }

    def testResponse {
        helloEndpoint = new ScalaEndpoint()

        val responseFuture: CompletableFuture[ResponseInfo[String]] = helloEndpoint.execute(null, null, null)
        val responseInfo: ResponseInfo[String] = responseFuture.join()

        assertEquals(responseInfo.getHttpStatusCode(), 200)
        assertEquals(responseInfo.getContentForFullResponse(), "Hello, world!")
    }
}
