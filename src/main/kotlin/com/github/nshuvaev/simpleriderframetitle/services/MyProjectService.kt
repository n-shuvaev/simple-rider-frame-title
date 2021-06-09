package com.github.nshuvaev.simpleriderframetitle.services

import com.github.nshuvaev.simpleriderframetitle.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
