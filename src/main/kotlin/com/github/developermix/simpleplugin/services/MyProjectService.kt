package com.github.developermix.simpleplugin.services

import com.github.developermix.simpleplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
