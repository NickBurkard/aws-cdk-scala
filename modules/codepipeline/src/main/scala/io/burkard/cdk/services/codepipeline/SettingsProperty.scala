package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SettingsProperty {

  def apply(
    entityUrlTemplate: Option[String] = None,
    executionUrlTemplate: Option[String] = None,
    revisionUrlTemplate: Option[String] = None,
    thirdPartyConfigurationUrl: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionType.SettingsProperty.Builder)
      .entityUrlTemplate(entityUrlTemplate.orNull)
      .executionUrlTemplate(executionUrlTemplate.orNull)
      .revisionUrlTemplate(revisionUrlTemplate.orNull)
      .thirdPartyConfigurationUrl(thirdPartyConfigurationUrl.orNull)
      .build()
}
