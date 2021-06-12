package com.github.clojj.ijunison.services

import com.github.clojj.ijunison.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
