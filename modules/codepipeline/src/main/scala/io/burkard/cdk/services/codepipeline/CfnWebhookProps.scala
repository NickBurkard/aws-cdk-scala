package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebhookProps {

  def apply(
    targetPipeline: String,
    filters: List[_],
    targetAction: String,
    targetPipelineVersion: Number,
    authentication: String,
    authenticationConfiguration: software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookAuthConfigurationProperty,
    name: Option[String] = None,
    registerWithThirdParty: Option[Boolean] = None
  ): software.amazon.awscdk.services.codepipeline.CfnWebhookProps =
    (new software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder)
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
