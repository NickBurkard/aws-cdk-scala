package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CnameInstanceBaseProps {

  def apply(
    instanceCname: String,
    instanceId: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps =
    (new software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.Builder)
      .instanceCname(instanceCname)
      .instanceId(instanceId.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
