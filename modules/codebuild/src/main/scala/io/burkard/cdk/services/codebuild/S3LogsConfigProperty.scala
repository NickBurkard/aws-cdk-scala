package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LogsConfigProperty {

  def apply(
    status: String,
    location: Option[String] = None,
    encryptionDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder)
      .status(status)
      .location(location.orNull)
      .encryptionDisabled(encryptionDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
