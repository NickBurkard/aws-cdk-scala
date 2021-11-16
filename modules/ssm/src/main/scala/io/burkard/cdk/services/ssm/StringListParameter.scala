package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StringListParameter {

  def apply(
    internalResourceId: String,
    stringListValue: List[String],
    simpleName: Option[Boolean] = None,
    tier: Option[software.amazon.awscdk.services.ssm.ParameterTier] = None,
    description: Option[String] = None,
    parameterName: Option[String] = None,
    allowedPattern: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.StringListParameter =
    software.amazon.awscdk.services.ssm.StringListParameter.Builder
      .create(stackCtx, internalResourceId)
      .stringListValue(stringListValue.asJava)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tier(tier.orNull)
      .description(description.orNull)
      .parameterName(parameterName.orNull)
      .allowedPattern(allowedPattern.orNull)
      .build()
}
