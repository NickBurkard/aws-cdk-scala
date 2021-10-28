package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputTransformerProperty {

  def apply(
    inputTemplate: Option[String] = None,
    inputPathsMap: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty =
    (new software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder)
      .inputTemplate(inputTemplate.orNull)
      .inputPathsMap(inputPathsMap.map(_.asJava).orNull)
      .build()
}
