package io.burkard.cdk.services.codestar

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeProperty {

  def apply(
    s3: Option[software.amazon.awscdk.services.codestar.CfnGitHubRepository.S3Property] = None
  ): software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty =
    (new software.amazon.awscdk.services.codestar.CfnGitHubRepository.CodeProperty.Builder)
      .s3(s3.orNull)
      .build()
}
