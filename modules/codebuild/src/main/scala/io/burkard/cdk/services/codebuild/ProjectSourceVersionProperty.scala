package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectSourceVersionProperty {

  def apply(
    sourceIdentifier: String,
    sourceVersion: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.Builder)
      .sourceIdentifier(sourceIdentifier)
      .sourceVersion(sourceVersion.orNull)
      .build()
}
