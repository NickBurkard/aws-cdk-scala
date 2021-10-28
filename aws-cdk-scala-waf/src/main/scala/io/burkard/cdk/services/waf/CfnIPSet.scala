package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIPSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    ipSetDescriptors: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnIPSet =
    software.amazon.awscdk.services.waf.regional.CfnIPSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .ipSetDescriptors(ipSetDescriptors.map(_.asJava).orNull)
      .build()
}
