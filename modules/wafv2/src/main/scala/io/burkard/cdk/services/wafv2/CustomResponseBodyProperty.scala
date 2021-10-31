package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomResponseBodyProperty {

  def apply(
    contentType: Option[String] = None,
    content: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseBodyProperty.Builder)
      .contentType(contentType.orNull)
      .content(content.orNull)
      .build()
}
