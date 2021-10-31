package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectFileSystemLocationProperty {

  def apply(
    mountOptions: Option[String] = None,
    location: Option[String] = None,
    identifier: Option[String] = None,
    mountPoint: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.Builder)
      .mountOptions(mountOptions.orNull)
      .location(location.orNull)
      .identifier(identifier.orNull)
      .mountPoint(mountPoint.orNull)
      .`type`(`type`.orNull)
      .build()
}
