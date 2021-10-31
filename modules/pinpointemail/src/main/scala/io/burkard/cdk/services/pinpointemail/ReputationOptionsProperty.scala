package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReputationOptionsProperty {

  def apply(
    reputationMetricsEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet.ReputationOptionsProperty.Builder)
      .reputationMetricsEnabled(reputationMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
