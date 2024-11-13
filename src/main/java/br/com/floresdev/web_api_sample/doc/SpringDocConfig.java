package br.com.floresdev.web_api_sample.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Anotações que substituem @EnableSwagger2 e habilitam a utilização dos Beans para configuração dos docs
 * */
@Configuration
@OpenAPIDefinition
public class SpringDocConfig {

    /**
     * Arquivo de configuração simplificada usando SpringDoc ao invés do obsoleto SpringFox
     * */
    @Bean
    public OpenAPI webApiSampleOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Web API Sample using Spring")
                        .description("Spring Web API sample for study")
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Web API Sample Documentation")
                        .url("localhost:8080/swagger-ui.html"));
    }

}
