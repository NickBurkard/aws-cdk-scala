package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebhook {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    targetPipeline: Option[String] = None,
    registerWithThirdParty: Option[Boolean] = None,
    filters: Option[List[_]] = None,
    targetAction: Option[String] = None,
    targetPipelineVersion: Option[Number] = None,
    authentication: Option[String] = None,
    authenticationConfiguration: Option[software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnWebhook =
    software.amazon.awscdk.services.codepipeline.CfnWebhook.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .targetPipeline(targetPipeline.orNull)
      .registerWithThirdParty(registerWithThirdParty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filters(filters.map(_.asJava).orNull)
      .targetAction(targetAction.orNull)
      .targetPipelineVersion(targetPipelineVersion.orNull)
      .authentication(authentication.orNull)
      .authenticationConfiguration(authenticationConfiguration.orNull)
      .build()
}
