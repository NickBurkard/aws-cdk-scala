package io.burkard.cdk.codegen

import sbt.File

// Code generator via some source.
trait SourceGenerator[A] {
  def baseFile(root: File, source: A): File

  def content(source: A): String

  final def cdkFile(root: File, source: A): CdkFile =
    CdkFile(baseFile(root, source), content(source))
}

object SourceGenerator {
  def apply[A: SourceGenerator]: SourceGenerator[A] = implicitly[SourceGenerator[A]]
}
