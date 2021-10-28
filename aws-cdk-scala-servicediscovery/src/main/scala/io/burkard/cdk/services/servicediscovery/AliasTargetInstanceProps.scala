package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AliasTargetInstanceProps {

  def apply(
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    dnsName: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.Builder)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .dnsName(dnsName.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
