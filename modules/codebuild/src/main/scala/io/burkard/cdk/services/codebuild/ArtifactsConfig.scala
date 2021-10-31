package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactsConfig {

  def apply(
    artifactsProperty: Option[software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty] = None
  ): software.amazon.awscdk.services.codebuild.ArtifactsConfig =
    (new software.amazon.awscdk.services.codebuild.ArtifactsConfig.Builder)
      .artifactsProperty(artifactsProperty.orNull)
      .build()
}
