package io.burkard.cdk.services.frauddetector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVariable {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    variableType: Option[String] = None,
    dataSource: Option[String] = None,
    dataType: Option[String] = None,
    defaultValue: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.frauddetector.CfnVariable =
    software.amazon.awscdk.services.frauddetector.CfnVariable.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .variableType(variableType.orNull)
      .dataSource(dataSource.orNull)
      .dataType(dataType.orNull)
      .defaultValue(defaultValue.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
