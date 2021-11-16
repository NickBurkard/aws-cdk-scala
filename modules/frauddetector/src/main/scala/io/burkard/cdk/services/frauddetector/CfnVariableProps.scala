package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVariableProps {

  def apply(
    name: String,
    dataSource: String,
    dataType: String,
    defaultValue: String,
    variableType: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnVariableProps =
    (new software.amazon.awscdk.services.frauddetector.CfnVariableProps.Builder)
      .name(name)
      .dataSource(dataSource)
      .dataType(dataType)
      .defaultValue(defaultValue)
      .variableType(variableType.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
