package config;

import io.jaegertracing.Configuration;
import io.opentracing.Tracer;

import javax.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConfigJaeger {
	public ConfigJaeger() {
        init();
    }

    public void init() {
        Configuration.SamplerConfiguration samplerConfig = Configuration.SamplerConfiguration.fromEnv()
                .withType("const")
                .withParam(1);

        Configuration.ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv()
                .withLogSpans(true);

        Configuration config = new Configuration("mensajes")
                .withSampler(samplerConfig)
                .withReporter(reporterConfig);

        var tracer = config.getTracer();
        io.opentracing.util.GlobalTracer.register(tracer);
    }
}
