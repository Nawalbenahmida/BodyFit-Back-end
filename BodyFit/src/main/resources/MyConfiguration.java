
@Configuration
public class MyConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping('Access-Control-Allow-Origin', '*');
		        .allowedOrigins("http://localhost:4200");
		        .allowedMethods("POST", "PUT", "GET", "OPTIONS", "DELETE")
		
	}
}
