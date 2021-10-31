package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FieldToMatchProperty {

  def apply(
    data: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty =
    (new software.amazon.awscdk.services.waf.CfnXssMatchSet.FieldToMatchProperty.Builder)
      .data(data.orNull)
      .`type`(`type`.orNull)
      .build()
}
