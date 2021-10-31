package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TCPFlagFieldProperty {

  def apply(
    flags: Option[List[String]] = None,
    masks: Option[List[String]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.TCPFlagFieldProperty.Builder)
      .flags(flags.map(_.asJava).orNull)
      .masks(masks.map(_.asJava).orNull)
      .build()
}
