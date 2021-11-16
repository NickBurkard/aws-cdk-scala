package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoOptions {

  def apply(
    role: software.amazon.awscdk.services.iam.IRole,
    identityPoolId: String,
    userPoolId: String
  ): software.amazon.awscdk.services.opensearchservice.CognitoOptions =
    (new software.amazon.awscdk.services.opensearchservice.CognitoOptions.Builder)
      .role(role)
      .identityPoolId(identityPoolId)
      .userPoolId(userPoolId)
      .build()
}
