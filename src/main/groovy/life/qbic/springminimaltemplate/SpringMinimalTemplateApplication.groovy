package life.qbic.springminimaltemplate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
class SpringMinimalTemplateApplication {

	static void main(String[] args) {
		SpringApplication.run(SpringMinimalTemplateApplication, args)

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)

		MessageService service = context.getBean("messageService", MessageService.class)
		println "####################### Message of the day ##################"
		println service.collect()
		println "##############################################################"

		context.close()
	}

}
