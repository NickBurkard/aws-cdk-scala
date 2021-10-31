package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFormationStackDriftDetectionCheckProps {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    description: Option[String] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None,
    ownStackOnly: Option[Boolean] = None
  ): software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps =
    (new software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps.Builder)
      .role(role.orNull)
      .description(description.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .ownStackOnly(ownStackOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
