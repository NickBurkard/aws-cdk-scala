package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StateProperty {

  def apply(
    name: Option[String] = None,
    code: Option[Number] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty.Builder)
      .name(name.orNull)
      .code(code.orNull)
      .build()
}
