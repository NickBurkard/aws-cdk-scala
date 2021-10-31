package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoOptions {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    identityPoolId: Option[String] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CognitoOptions =
    (new software.amazon.awscdk.services.opensearchservice.CognitoOptions.Builder)
      .role(role.orNull)
      .identityPoolId(identityPoolId.orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
