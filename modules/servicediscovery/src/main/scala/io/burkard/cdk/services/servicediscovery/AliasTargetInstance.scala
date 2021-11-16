package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasTargetInstance {

  def apply(
    internalResourceId: String,
    service: software.amazon.awscdk.services.servicediscovery.IService,
    dnsName: String,
    instanceId: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.AliasTargetInstance =
    software.amazon.awscdk.services.servicediscovery.AliasTargetInstance.Builder
      .create(stackCtx, internalResourceId)
      .service(service)
      .dnsName(dnsName)
      .instanceId(instanceId.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
