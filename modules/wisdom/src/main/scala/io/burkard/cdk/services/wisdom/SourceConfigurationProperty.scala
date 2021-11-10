package io.burkard.cdk.services.wisdom

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceConfigurationProperty {

  def apply(
    appIntegrations: Option[software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty] = None
  ): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty =
    (new software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.SourceConfigurationProperty.Builder)
      .appIntegrations(appIntegrations.orNull)
      .build()
}
