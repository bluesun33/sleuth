# sleuth

A fork of https://github.com/forezp/SpringCloudLearning/tree/master/chapter-sleuth

Spring Cloud 1.5 is deprecated, and is updated to 2.1.1.RELEASE
Updated dependecies to match Spring cloud version.
Updated Tracer to use Brave, as required for Spring Cloud 2.x
zipkin.server.EnableZipkinServer is now deprecated and custom Zipkin Servers are not allowed. The module Zipkin-Server is thus deprecated. Consult zipkin website for zipkin server setup.
