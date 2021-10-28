package io.burkard.cdk.services.frauddetector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVariableProps {

  def apply(
    name: Option[String] = None,
    variableType: Option[String] = None,
    dataSource: Option[String] = None,
    dataType: Option[String] = None,
    defaultValue: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.frauddetector.CfnVariableProps =
    (new software.amazon.awscdk.services.frauddetector.CfnVariableProps.Builder)
      .name(name.orNull)
      .variableType(variableType.orNull)
      .dataSource(dataSource.orNull)
      .dataType(dataType.orNull)
      .defaultValue(defaultValue.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
