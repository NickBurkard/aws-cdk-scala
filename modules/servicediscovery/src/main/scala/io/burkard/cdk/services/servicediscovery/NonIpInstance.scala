package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NonIpInstance {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    customAttributes: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.NonIpInstance =
    software.amazon.awscdk.services.servicediscovery.NonIpInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
