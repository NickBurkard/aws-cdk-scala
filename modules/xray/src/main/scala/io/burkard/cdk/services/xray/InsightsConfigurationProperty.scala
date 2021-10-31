package io.burkard.cdk.services.xray

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InsightsConfigurationProperty {

  def apply(
    insightsEnabled: Option[Boolean] = None,
    notificationsEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty =
    (new software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.Builder)
      .insightsEnabled(insightsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .notificationsEnabled(notificationsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
