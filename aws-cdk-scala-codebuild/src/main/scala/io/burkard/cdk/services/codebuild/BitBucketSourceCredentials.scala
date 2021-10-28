package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BitBucketSourceCredentials {

  def apply(
    internalResourceId: String,
    username: Option[software.amazon.awscdk.SecretValue] = None,
    password: Option[software.amazon.awscdk.SecretValue] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials =
    software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder
      .create(stackCtx, internalResourceId)
      .username(username.orNull)
      .password(password.orNull)
      .build()
}
