package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TreeArtifactProperties {

  def apply(
    file: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties =
    (new software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties.Builder)
      .file(file.orNull)
      .build()
}
