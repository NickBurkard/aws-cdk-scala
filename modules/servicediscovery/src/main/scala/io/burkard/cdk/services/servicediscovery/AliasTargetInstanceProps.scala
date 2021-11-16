package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasTargetInstanceProps {

  def apply(
    service: software.amazon.awscdk.services.servicediscovery.IService,
    dnsName: String,
    instanceId: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps =
    (new software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps.Builder)
      .service(service)
      .dnsName(dnsName)
      .instanceId(instanceId.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
