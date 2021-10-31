package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
