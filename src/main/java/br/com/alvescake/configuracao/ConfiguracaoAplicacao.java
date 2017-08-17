package br.com.alvescake.configuracao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableScheduling
@EnableWebMvc
@ComponentScan(basePackages = "br.com.alvescake")
public class ConfiguracaoAplicacao extends WebMvcConfigurerAdapter {
	/*
	 * final Logger logger =
	 * LoggerFactory.getLogger(ConfiguracaoAplicacao.class);
	 * 
	 * @Bean public WebMvcConfigurer corsConfigurer() {return new
	 * WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**") .allowedOrigins("*") .allowedMethods("*")
	 * .allowedHeaders("*") .allowCredentials(false).maxAge(300); } }; }
	 */

}
