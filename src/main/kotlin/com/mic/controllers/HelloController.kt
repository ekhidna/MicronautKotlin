package com.mic.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/hello")
class HelloController {

	@Get(uri = "/", produces = ["text/plain"])
	fun index(): String {
		return "Olá João"
	}

	@Get(uri = "/hello/{hello}", produces = ["text/plain"])
	fun sayHelloWithInputVar(helloVar: String, @PathVariable hello: String): String {
		return "Hello you $helloVar from Micronaut swagger"
	}
}

//http://localhost:8080/swagger/views/swagger-ui/