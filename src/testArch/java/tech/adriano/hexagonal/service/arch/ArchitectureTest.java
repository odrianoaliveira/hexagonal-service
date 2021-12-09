package tech.adriano.hexagonal.service.arch;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "tech.adriano")
public class ArchitectureTest {
	
	@ArchTest
	static final ArchRule portsContainOnlyInterfaces = classes().that().resideInAPackage("..core.usecase.port..")
			.should().beInterfaces();
	
	/**
	 * Additional effort required to fix this test, we are not protecting core now
	 */
	@ArchTest
	static final ArchRule protectCoreBusiness = noClasses().that().resideInAPackage("..core..")
			.should().accessClassesThat().resideInAPackage("io.micronaut..")
			.orShould().accessClassesThat().resideInAPackage("org.immutables..")
			.because("we do not want to couple our core business with frameworks and libraries");
	
	@ArchTest
	// https://www.archunit.org/userguide/html/000_Index.html#_onion_architecture
	static final ArchRule onionArchitecture_check = onionArchitecture()
			.domainModels("tech.adriano..core.domain..")
			.domainServices("tech.adriano..core.usecase..")
			.applicationServices("tech.adriano..application..")
			.adapter("persistence", "tech.adriano..adapter.persistence..")
			.adapter("messaging", "tech.adriano..adapter.messaging..")
			.adapter("rest", "tech.adriano..adapter.rest..");
	
	
}
