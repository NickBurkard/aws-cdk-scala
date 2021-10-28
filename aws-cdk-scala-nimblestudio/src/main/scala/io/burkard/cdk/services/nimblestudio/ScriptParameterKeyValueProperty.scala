package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScriptParameterKeyValueProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ScriptParameterKeyValueProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
