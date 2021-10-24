package io.burkard.cdk.codegen

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Path}

final case class SourceFile(path: Path, content: String) {
  def writeToSource(): Unit = {
    if (!Files.exists(path)) {
      Files.createDirectories(path.getParent)
      Files.createFile(path)
    }
    val _ = Files.write(path, content.getBytes(StandardCharsets.UTF_8))
  }
}
