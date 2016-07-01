package org.m2ci.msp.hello

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('hello') {
            doLast {
                println 'HELLO'
            }
        }
    }
}
