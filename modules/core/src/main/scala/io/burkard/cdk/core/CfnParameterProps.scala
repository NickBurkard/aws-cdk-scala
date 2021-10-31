package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnParameterProps {

  def apply(
    minValue: Option[Number] = None,
    minLength: Option[Number] = None,
    defaultValue: Option[AnyRef] = None,
    maxLength: Option[Number] = None,
    allowedPattern: Option[String] = None,
    noEcho: Option[Boolean] = None,
    constraintDescription: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[List[String]] = None,
    maxValue: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.CfnParameterProps =
    (new software.amazon.awscdk.CfnParameterProps.Builder)
      .minValue(minValue.orNull)
      .minLength(minLength.orNull)
      .defaultValue(defaultValue.orNull)
      .maxLength(maxLength.orNull)
      .allowedPattern(allowedPattern.orNull)
      .noEcho(noEcho.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .constraintDescription(constraintDescription.orNull)
      .description(description.orNull)
      .allowedValues(allowedValues.map(_.asJava).orNull)
      .maxValue(maxValue.orNull)
      .`type`(`type`.orNull)
      .build()
}
