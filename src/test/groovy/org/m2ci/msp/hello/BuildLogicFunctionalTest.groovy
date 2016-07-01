package org.m2ci.msp.hello

import org.gradle.testkit.runner.*
import org.testng.annotations.*

class BuildLogicFunctionalTest {

    @Test
    void testPlugin() {
        def testDir = new File(System.properties.testDir)
        def buildScriptFile = new File(testDir, 'build.gradle')
        buildScriptFile.text = [
                'plugins {',
                '  id "org.m2ci.msp.hello-plugin"',
                '}'
        ].join('\n')
        def result = GradleRunner.create().withPluginClasspath().withProjectDir(testDir).withArguments('hello').build()
        assert result.task(':hello').outcome == TaskOutcome.SUCCESS
    }

}
