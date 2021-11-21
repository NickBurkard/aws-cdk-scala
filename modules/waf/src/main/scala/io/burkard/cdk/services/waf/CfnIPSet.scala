package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIPSet {

  def apply(
    internalResourceId: String,
    name: String,
    ipSetDescriptors: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnIPSet =
    software.amazon.awscdk.services.waf.CfnIPSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .ipSetDescriptors(ipSetDescriptors.map(_.asJava).orNull)
      .build()
}
