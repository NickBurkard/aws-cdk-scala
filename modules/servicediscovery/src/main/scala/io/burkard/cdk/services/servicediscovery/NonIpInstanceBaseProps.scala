package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NonIpInstanceBaseProps {

  def apply(
    instanceId: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps =
    (new software.amazon.awscdk.services.servicediscovery.NonIpInstanceBaseProps.Builder)
      .instanceId(instanceId.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
