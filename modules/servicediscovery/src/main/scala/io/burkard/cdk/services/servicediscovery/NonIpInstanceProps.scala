package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NonIpInstanceProps {

  def apply(
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps.Builder)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
