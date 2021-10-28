package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DecodeConfigProperty {

  def apply(
    unvalidatedJson: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty.Builder)
      .unvalidatedJson(unvalidatedJson.orNull)
      .build()
}
