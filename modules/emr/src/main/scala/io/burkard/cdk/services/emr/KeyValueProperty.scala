package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyValueProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty =
    (new software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
