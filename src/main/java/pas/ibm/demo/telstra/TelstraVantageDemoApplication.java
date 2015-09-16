package pas.ibm.demo.telstra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TelstraVantageDemoApplication {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(TelstraVantageDemoApplication.class, args);
    }

    @PostConstruct
    private void init()
    {
        repository.save(new Employee("pas", "apicella"));
        repository.save(new Employee("lucia", "apicella"));
        repository.save(new Employee("lucas", "apicella"));
        repository.save(new Employee("siena", "apicella"));
    }
}
