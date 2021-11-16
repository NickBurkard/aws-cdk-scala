package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BitBucketSourceCredentials {

  def apply(
    internalResourceId: String,
    username: software.amazon.awscdk.SecretValue,
    password: software.amazon.awscdk.SecretValue
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials =
    software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials.Builder
      .create(stackCtx, internalResourceId)
      .username(username)
      .password(password)
      .build()
}
