package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LabelProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.LabelProperty.Builder)
      .name(name.orNull)
      .build()
}
