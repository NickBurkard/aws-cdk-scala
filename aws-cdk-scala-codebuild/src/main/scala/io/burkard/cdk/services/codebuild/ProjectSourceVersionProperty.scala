package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectSourceVersionProperty {

  def apply(
    sourceVersion: Option[String] = None,
    sourceIdentifier: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.Builder)
      .sourceVersion(sourceVersion.orNull)
      .sourceIdentifier(sourceIdentifier.orNull)
      .build()
}
