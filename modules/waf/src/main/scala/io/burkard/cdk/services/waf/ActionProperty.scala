package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
