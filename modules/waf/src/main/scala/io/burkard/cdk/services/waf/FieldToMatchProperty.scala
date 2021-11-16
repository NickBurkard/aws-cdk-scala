package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FieldToMatchProperty {

  def apply(
    `type`: String,
    data: Option[String] = None
  ): software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder)
      .`type`(`type`)
      .data(data.orNull)
      .build()
}
