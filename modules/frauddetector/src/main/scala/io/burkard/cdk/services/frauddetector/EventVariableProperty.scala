package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventVariableProperty {

  def apply(
    arn: Option[String] = None,
    variableType: Option[String] = None,
    inline: Option[Boolean] = None,
    dataSource: Option[String] = None,
    createdTime: Option[String] = None,
    dataType: Option[String] = None,
    defaultValue: Option[String] = None,
    name: Option[String] = None,
    lastUpdatedTime: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty =
    (new software.amazon.awscdk.services.frauddetector.CfnDetector.EventVariableProperty.Builder)
      .arn(arn.orNull)
      .variableType(variableType.orNull)
      .inline(inline.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataSource(dataSource.orNull)
      .createdTime(createdTime.orNull)
      .dataType(dataType.orNull)
      .defaultValue(defaultValue.orNull)
      .name(name.orNull)
      .lastUpdatedTime(lastUpdatedTime.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
