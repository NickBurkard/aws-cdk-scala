package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnParameter {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnParameter =
    software.amazon.awscdk.CfnParameter.Builder
      .create(stackCtx, internalResourceId)
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
