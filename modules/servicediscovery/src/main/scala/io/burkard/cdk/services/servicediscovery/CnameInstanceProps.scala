package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CnameInstanceProps {

  def apply(
    service: software.amazon.awscdk.services.servicediscovery.IService,
    instanceId: Option[String] = None,
    instanceCname: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.CnameInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.CnameInstanceProps.Builder)
      .service(service)
      .instanceId(instanceId.orNull)
      .instanceCname(instanceCname.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
