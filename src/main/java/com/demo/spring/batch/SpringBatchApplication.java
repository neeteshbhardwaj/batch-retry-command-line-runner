package com.demo.spring.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
@EnableBatchProcessing
@Data
@NoArgsConstructor
@AllArgsConstructor
@EnableRetry
public class SpringBatchApplication implements CommandLineRunner {

	@Autowired
	private JobBuilderFactory jobs;

	@Autowired
	private StepBuilderFactory steps;

	@Autowired
	JobLauncher jobLauncher;

	public static void main(final String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
	}

	@Bean
	public Job job() {
		return jobs.get("myJob").start(step1()).build();
	}

	@Bean
	public Step step1() {
		return steps.get("step1").<String, String>chunk(1).reader(myReader())
				.processor(myProcessor()).writer(myWriter())
				.build();
	}

	@Bean
	@StepScope
	public MyReader myReader() {
		return new MyReader();
	}

	@Bean
	public MyProcessor myProcessor() {
		return new MyProcessor();
	}

	@Bean
	public MyWriter myWriter() {
		return new MyWriter();
	}


	@Override
	public void run(String... args) throws Exception {
		JobParameters params = new JobParametersBuilder()
				.addString("JobID", String.valueOf(System.currentTimeMillis()))
				.toJobParameters();
		jobLauncher.run(job(), params);
	}

}
