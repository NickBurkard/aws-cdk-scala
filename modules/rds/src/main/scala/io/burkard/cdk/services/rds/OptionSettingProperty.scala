package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionSettingProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty =
    (new software.amazon.awscdk.services.rds.CfnOptionGroup.OptionSettingProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
