package io.burkard.cdk.codegen

import java.nio.file.Path

// Code generator via some source.
trait SourceGenerator[A] {
  def moduleName(source: A): String

  def path(source: A): Path

  def gen(source: A): String

  final def sourceFile(source: A): SourceFile =
    SourceFile(moduleName(source), path(source), gen(source))
}
