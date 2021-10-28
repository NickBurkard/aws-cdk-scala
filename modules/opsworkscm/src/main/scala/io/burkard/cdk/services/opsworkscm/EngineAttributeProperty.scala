package io.burkard.cdk.services.opsworkscm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EngineAttributeProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty =
    (new software.amazon.awscdk.services.opsworkscm.CfnServer.EngineAttributeProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
