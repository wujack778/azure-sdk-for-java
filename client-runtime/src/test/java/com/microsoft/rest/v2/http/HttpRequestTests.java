package com.microsoft.rest.v2.http;

import io.reactivex.Flowable;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class HttpRequestTests {
    @Test
    public void constructor() {
        final HttpRequest request = new HttpRequest("request caller method", "request http method", "request url");
        assertEquals("request caller method", request.callerMethod());
        assertEquals("request http method", request.httpMethod());
        assertEquals("request url", request.url());
    }

    @Test
    public void testClone() throws IOException {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("my-header", "my-value");
        headers.set("other-header", "other-value");

        final HttpRequest request = new HttpRequest(
                "request caller method",
                "request http method",
                "request url",
                headers,
                new FlowableHttpRequestBody(0, "application/octet-stream", Flowable.just(new byte[0]), true));

        final HttpRequest bufferedRequest = request.buffer();

        assertNotSame(request, bufferedRequest);

        assertEquals(request.callerMethod(), bufferedRequest.callerMethod());
        assertEquals(request.httpMethod(), bufferedRequest.httpMethod());
        assertEquals(request.url(), bufferedRequest.url());

        assertNotSame(request.headers(), bufferedRequest.headers());
        assertEquals(request.headers().toMap().size(), bufferedRequest.headers().toMap().size());
        for (HttpHeader clonedHeader : bufferedRequest.headers()) {
            for (HttpHeader originalHeader : request.headers()) {
                assertNotSame(clonedHeader, originalHeader);
            }

            assertEquals(clonedHeader.value(), request.headers().value(clonedHeader.name()));
        }

        assertSame(request.body(), bufferedRequest.body());
    }
}
