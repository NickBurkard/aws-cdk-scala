package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerImageOptions {

  def apply(
    secretsManagerCredentials: Option[software.amazon.awscdk.services.secretsmanager.ISecret] = None
  ): software.amazon.awscdk.services.codebuild.DockerImageOptions =
    (new software.amazon.awscdk.services.codebuild.DockerImageOptions.Builder)
      .secretsManagerCredentials(secretsManagerCredentials.orNull)
      .build()
}
