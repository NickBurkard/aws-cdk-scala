package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BitBucketSourceCredentialsProps {

  def apply(
    username: software.amazon.awscdk.SecretValue,
    password: software.amazon.awscdk.SecretValue
  ): software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps =
    (new software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps.Builder)
      .username(username)
      .password(password)
      .build()
}
