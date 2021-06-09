package com.nshuvaev.simpleriderframetitle

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.wm.impl.FrameTitleBuilder

class PathTitleBuilder : FrameTitleBuilder() {

    override fun getFileTitle(project: Project, virtualFile: VirtualFile): String {
        return virtualFile.getName()
    }

    override fun getProjectTitle(project: Project): String {
        return project.getBaseDir().getName()
    }
}
