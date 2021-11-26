package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ThresholdProperty {

  def apply(
    value: Number,
    unit: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty =
    (new software.amazon.awscdk.services.databrew.CfnRuleset.ThresholdProperty.Builder)
      .value(value)
      .unit(unit.orNull)
      .`type`(`type`.orNull)
      .build()
}
