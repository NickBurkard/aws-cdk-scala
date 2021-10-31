package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRemediationConfiguration {

  def apply(
    internalResourceId: String,
    automatic: Option[Boolean] = None,
    resourceType: Option[String] = None,
    executionControls: Option[software.amazon.awscdk.services.config.CfnRemediationConfiguration.ExecutionControlsProperty] = None,
    targetVersion: Option[String] = None,
    targetId: Option[String] = None,
    retryAttemptSeconds: Option[Number] = None,
    maximumAutomaticAttempts: Option[Number] = None,
    targetType: Option[String] = None,
    configRuleName: Option[String] = None,
    parameters: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnRemediationConfiguration =
    software.amazon.awscdk.services.config.CfnRemediationConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .automatic(automatic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceType(resourceType.orNull)
      .executionControls(executionControls.orNull)
      .targetVersion(targetVersion.orNull)
      .targetId(targetId.orNull)
      .retryAttemptSeconds(retryAttemptSeconds.orNull)
      .maximumAutomaticAttempts(maximumAutomaticAttempts.orNull)
      .targetType(targetType.orNull)
      .configRuleName(configRuleName.orNull)
      .parameters(parameters.orNull)
      .build()
}
