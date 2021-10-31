package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AllowActionProperty {

  def apply(
    customRequestHandling: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.AllowActionProperty.Builder)
      .customRequestHandling(customRequestHandling.orNull)
      .build()
}
