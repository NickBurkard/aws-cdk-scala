package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SmsConfigurationProperty {

  def apply(
    externalId: Option[String] = None,
    snsCallerArn: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.SmsConfigurationProperty.Builder)
      .externalId(externalId.orNull)
      .snsCallerArn(snsCallerArn.orNull)
      .build()
}
