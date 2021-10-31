package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolAddOnsProperty {

  def apply(
    advancedSecurityMode: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.UserPoolAddOnsProperty.Builder)
      .advancedSecurityMode(advancedSecurityMode.orNull)
      .build()
}
