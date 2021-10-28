package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CnameInstanceProps {

  def apply(
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    instanceCname: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.CnameInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.CnameInstanceProps.Builder)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .instanceCname(instanceCname.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}