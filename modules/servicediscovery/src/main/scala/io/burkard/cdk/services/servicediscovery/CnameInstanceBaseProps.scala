package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CnameInstanceBaseProps {

  def apply(
    instanceId: Option[String] = None,
    instanceCname: Option[String] = None,
    customAttributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps =
    (new software.amazon.awscdk.services.servicediscovery.CnameInstanceBaseProps.Builder)
      .instanceId(instanceId.orNull)
      .instanceCname(instanceCname.orNull)
      .customAttributes(customAttributes.map(_.asJava).orNull)
      .build()
}
