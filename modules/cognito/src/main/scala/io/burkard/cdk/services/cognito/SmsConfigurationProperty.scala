package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
