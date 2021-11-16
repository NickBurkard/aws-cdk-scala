package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemConfig {

  def apply(
    location: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty
  ): software.amazon.awscdk.services.codebuild.FileSystemConfig =
    (new software.amazon.awscdk.services.codebuild.FileSystemConfig.Builder)
      .location(location)
      .build()
}
