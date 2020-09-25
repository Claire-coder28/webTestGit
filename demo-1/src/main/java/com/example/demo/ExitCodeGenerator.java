package com.example.demo;

@FunctionalInterface
public interface ExitCodeGenerator {
	/**
     * Returns the exit code that should be returned from the application.
     * @return the exit code.
     */
	int getExitCode();
}
