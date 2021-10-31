package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TreeArtifactProperties {

  def apply(
    file: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties =
    (new software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.Builder)
      .file(file.orNull)
      .build()
}
