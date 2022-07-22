package com.github.muthuishere.darttestgenerator.services

import com.intellij.openapi.project.Project
import com.github.muthuishere.darttestgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
