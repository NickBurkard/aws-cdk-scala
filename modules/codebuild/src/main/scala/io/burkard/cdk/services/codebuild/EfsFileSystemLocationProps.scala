package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EfsFileSystemLocationProps {

  def apply(
    location: String,
    identifier: String,
    mountPoint: String,
    mountOptions: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps =
    (new software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps.Builder)
      .location(location)
      .identifier(identifier)
      .mountPoint(mountPoint)
      .mountOptions(mountOptions.orNull)
      .build()
}
