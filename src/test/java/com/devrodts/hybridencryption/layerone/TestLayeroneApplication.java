package com.devrodts.hybridencryption.layerone;

import org.springframework.boot.SpringApplication;

public class TestLayeroneApplication {

	public static void main(String[] args) {
		SpringApplication.from(LayeroneApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
