package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolDomainProps {

  def apply(
    cognitoDomain: Option[software.amazon.awscdk.services.cognito.CognitoDomainOptions] = None,
    customDomain: Option[software.amazon.awscdk.services.cognito.CustomDomainOptions] = None,
    userPool: Option[software.amazon.awscdk.services.cognito.IUserPool] = None
  ): software.amazon.awscdk.services.cognito.UserPoolDomainProps =
    (new software.amazon.awscdk.services.cognito.UserPoolDomainProps.Builder)
      .cognitoDomain(cognitoDomain.orNull)
      .customDomain(customDomain.orNull)
      .userPool(userPool.orNull)
      .build()
}
