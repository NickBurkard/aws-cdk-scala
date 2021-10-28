package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdditionalArtifact {

  def apply(
    artifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    directory: Option[String] = None
  ): software.amazon.awscdk.pipelines.AdditionalArtifact =
    (new software.amazon.awscdk.pipelines.AdditionalArtifact.Builder)
      .artifact(artifact.orNull)
      .directory(directory.orNull)
      .build()
}
