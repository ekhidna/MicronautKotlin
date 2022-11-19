package com.mic.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/demo")
class DemoController {

	@Get(uri="/", produces=["text/plain"])
	fun index(): String {
		return "Hey there."
	}
}