package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CnameInstance {

  def apply(
    internalResourceId: String,
    service: software.amazon.awscdk.services.servicediscovery.IService,
    instanceId: Option[String] = None,
    instanceCname: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CnameInstance =
    software.amazon.awscdk.services.servicediscovery.CnameInstance.Builder
      .create(stackCtx, internalResourceId)
      .service(service)
      .instanceId(instanceId.orNull)
      .instanceCname(instanceCname.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
