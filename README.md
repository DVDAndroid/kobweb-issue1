1. built empty application with kobwebStart
2. removed from `plugins` any kobweb plugin
3. created target js with same configuration as `configaskobwebapp`, removed jvm target and added `kotlin.srcDir("build/generated/kobweb/src/jsMain/kotlin")` and `resources.srcDir("build/generated/kobweb/src/jsMain/resources/public")` to js target
4. renamed main function in the generated main file
5. created a new main function which calls the renamed main function
6. run project with `jsBrowserDevelopmentRun`