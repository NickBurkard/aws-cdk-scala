package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StringListParameterProps {

  def apply(
    simpleName: Option[Boolean] = None,
    tier: Option[software.amazon.awscdk.services.ssm.ParameterTier] = None,
    description: Option[String] = None,
    parameterName: Option[String] = None,
    stringListValue: Option[List[String]] = None,
    allowedPattern: Option[String] = None
  ): software.amazon.awscdk.services.ssm.StringListParameterProps =
    (new software.amazon.awscdk.services.ssm.StringListParameterProps.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tier(tier.orNull)
      .description(description.orNull)
      .parameterName(parameterName.orNull)
      .stringListValue(stringListValue.map(_.asJava).orNull)
      .allowedPattern(allowedPattern.orNull)
      .build()
}
