package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BitBucketSourceCredentialsProps {

  def apply(
    username: Option[software.amazon.awscdk.SecretValue] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  ): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.Builder)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
