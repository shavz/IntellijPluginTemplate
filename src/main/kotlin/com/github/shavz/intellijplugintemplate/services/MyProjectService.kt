package com.github.shavz.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.shavz.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
