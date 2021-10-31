package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactsProps {

  def apply(
    identifier: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.ArtifactsProps =
    (new software.amazon.awscdk.services.codebuild.ArtifactsProps.Builder)
      .identifier(identifier.orNull)
      .build()
}
