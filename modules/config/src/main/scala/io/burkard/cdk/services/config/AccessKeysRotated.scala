package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessKeysRotated {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None,
    maxAge: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.AccessKeysRotated =
    software.amazon.awscdk.services.config.AccessKeysRotated.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .maxAge(maxAge.orNull)
      .build()
}
