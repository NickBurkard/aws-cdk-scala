package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProjectFileSystemLocationProperty {

  def apply(
    location: String,
    identifier: String,
    mountPoint: String,
    `type`: String,
    mountOptions: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.Builder)
      .location(location)
      .identifier(identifier)
      .mountPoint(mountPoint)
      .`type`(`type`)
      .mountOptions(mountOptions.orNull)
      .build()
}
