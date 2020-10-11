package com.example.demo.config;

import org.springframework.core.env.MapPropertySource;

import java.util.Map;

public class MyPropertySource extends MapPropertySource {
    /**
     * Create a new {@code MapPropertySource} with the given name and {@code Map}.
     *
     * @param name   the associated name
     * @param source the Map source (without {@code null} values in order to get
     *               consistent {@link #getProperty} and {@link #containsProperty} behavior)
     */
    public MyPropertySource(String name, Map<String, Object> source) {
        super(name, source);
    }
}
