package io.burkard.cdk.codegen

import java.nio.file.Path

// Code generator via some source.
trait SourceGenerator[A] {
  def path(source: A): Path

  def gen(source: A): String

  final def sourceFile(source: A): SourceFile =
    SourceFile(path(source), gen(source))
}
