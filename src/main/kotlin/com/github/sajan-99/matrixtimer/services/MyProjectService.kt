package com.github.sajan-99.matrixtimer.services

import com.intellij.openapi.project.Project
import com.github.sajan-99.matrixtimer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
