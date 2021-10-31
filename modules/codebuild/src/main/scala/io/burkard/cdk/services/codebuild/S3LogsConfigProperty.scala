package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LogsConfigProperty {

  def apply(
    location: Option[String] = None,
    status: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder)
      .location(location.orNull)
      .status(status.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
