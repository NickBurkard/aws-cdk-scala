package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebhook {

  def apply(
    internalResourceId: String,
    targetPipeline: String,
    filters: List[_],
    targetAction: String,
    targetPipelineVersion: Number,
    authentication: String,
    authenticationConfiguration: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty,
    name: Option[String] = None,
    registerWithThirdParty: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.CfnWebhook =
    software.amazon.awscdk.services.codepipeline.CfnWebhook.Builder
      .create(stackCtx, internalResourceId)
      .targetPipeline(targetPipeline)
      .filters(filters.asJava)
      .targetAction(targetAction)
      .targetPipelineVersion(targetPipelineVersion)
      .authentication(authentication)
      .authenticationConfiguration(authenticationConfiguration)
      .name(name.orNull)
      .registerWithThirdParty(registerWithThirdParty.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
