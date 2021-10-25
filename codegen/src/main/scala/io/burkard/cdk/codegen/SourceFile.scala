package io.burkard.cdk.codegen

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Path}

// A source file with content to be written to a file.
final case class SourceFile(moduleName: String, path: Path, content: String) {

  // Write to a source file, creating it and any parent directories if necessary.
  def writeToSource(): Unit = {
    if (!Files.exists(path)) {
      Files.createDirectories(path.getParent)
      Files.createFile(path)
    }
    val _ = Files.write(path, content.getBytes(StandardCharsets.UTF_8))
  }
}
