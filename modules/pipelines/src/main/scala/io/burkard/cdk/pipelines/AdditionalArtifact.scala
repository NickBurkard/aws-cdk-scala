package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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