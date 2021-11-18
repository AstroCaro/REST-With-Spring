package com.baeldung.um.service.impl;

import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;

@Component
final class MetricsExporterDropwizard {
    
    @Autowired
    private MetricRegistry metricRegistry;

    @Scheduled(fixedRate = 1000 * 30) //every 30 second
    public void exportMetrics() {
        final SortedMap<String, Counter> counters = metricRegistry.getCounters();
        final SortedMap<String, Gauge> gauges = metricRegistry.getGauges();         
    }
}
