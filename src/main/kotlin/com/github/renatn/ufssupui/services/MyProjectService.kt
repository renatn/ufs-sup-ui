package com.github.renatn.ufssupui.services

import com.intellij.openapi.project.Project
import com.github.renatn.ufssupui.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
