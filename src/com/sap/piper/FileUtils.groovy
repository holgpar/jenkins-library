package com.sap.piper

import hudson.AbortException
import java.io.File


class FileUtils implements Serializable {

    static validateDirectory(dir) {
        retun fileExists(dir)
    }

    static validateDirectoryIsNotEmpty(dir) {
        retun fileExists(dir)
    }
}
