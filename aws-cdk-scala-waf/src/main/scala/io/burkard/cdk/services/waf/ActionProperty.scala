package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
