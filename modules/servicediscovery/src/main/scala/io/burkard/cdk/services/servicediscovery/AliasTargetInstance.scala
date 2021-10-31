package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AliasTargetInstance {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    dnsName: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.AliasTargetInstance =
    software.amazon.awscdk.services.servicediscovery.AliasTargetInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .dnsName(dnsName.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
