package io.burkard.cdk.services.frauddetector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVariable {

  def apply(
    internalResourceId: String,
    name: String,
    dataSource: String,
    dataType: String,
    defaultValue: String,
    variableType: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.frauddetector.CfnVariable =
    software.amazon.awscdk.services.frauddetector.CfnVariable.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .dataSource(dataSource)
      .dataType(dataType)
      .defaultValue(defaultValue)
      .variableType(variableType.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
