package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudFormationStackDriftDetectionCheck {

  def apply(
    internalResourceId: String,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    description: Option[String] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None,
    ownStackOnly: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck =
    software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck.Builder
      .create(stackCtx, internalResourceId)
      .role(role.orNull)
      .description(description.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .ownStackOnly(ownStackOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
