package nz.co.camel.sample.tracer.config;

import javax.annotation.Resource;

import nz.co.camel.sample.config.CamelSpringContextConfig;

import org.apache.camel.CamelContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "nz.co.camel.sample.tracer")
@Import(value = CamelSpringContextConfig.class)
public class TrancerApplicationContextConfig {

	@Resource
	private CamelContext camelContext;

}
