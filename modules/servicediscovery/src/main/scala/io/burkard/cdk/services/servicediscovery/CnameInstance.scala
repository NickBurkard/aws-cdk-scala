package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CnameInstance {

  def apply(
    internalResourceId: String,
    instanceId: Option[String] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None,
    instanceCname: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CnameInstance =
    software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder
      .create(stackCtx, internalResourceId)
      .instanceId(instanceId.orNull)
      .service(service.orNull)
      .instanceCname(instanceCname.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
