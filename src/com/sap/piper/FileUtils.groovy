package com.sap.piper

import hudson.AbortException
import java.io.File

def _fileExists(dir) {
    return fileExists(dir)
}

class FileUtils implements Serializable {

    static validateDirectory(dir) {
        return _fileExists(dir)
    }

    static validateDirectoryIsNotEmpty(dir) {
        return _fileExists(dir)
    }
}
