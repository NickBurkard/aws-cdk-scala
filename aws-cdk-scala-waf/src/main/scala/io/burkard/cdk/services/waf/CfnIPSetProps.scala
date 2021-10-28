package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIPSetProps {

  def apply(
    name: Option[String] = None,
    ipSetDescriptors: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.CfnIPSetProps =
    (new software.amazon.awscdk.services.waf.CfnIPSetProps.Builder)
      .name(name.orNull)
      .ipSetDescriptors(ipSetDescriptors.map(_.asJava).orNull)
      .build()
}
