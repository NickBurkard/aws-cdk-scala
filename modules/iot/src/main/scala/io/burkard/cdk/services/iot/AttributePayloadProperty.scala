package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributePayloadProperty {

  def apply(
    attributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty =
    (new software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty.Builder)
      .attributes(attributes.map(_.asJava).orNull)
      .build()
}
