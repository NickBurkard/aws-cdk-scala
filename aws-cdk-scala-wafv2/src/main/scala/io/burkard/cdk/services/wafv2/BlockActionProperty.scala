package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlockActionProperty {

  def apply(
    customResponse: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.BlockActionProperty.Builder)
      .customResponse(customResponse.orNull)
      .build()
}
