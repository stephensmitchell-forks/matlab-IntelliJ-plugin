package com.github.korniloval.matlab

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class MatlabFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(MatlabFileType.INSTANCE, MatlabFileType.INSTANCE.defaultExtension)
    }
}
