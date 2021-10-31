package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
