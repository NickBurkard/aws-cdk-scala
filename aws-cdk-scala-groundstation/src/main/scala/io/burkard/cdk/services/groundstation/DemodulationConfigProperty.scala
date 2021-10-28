package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DemodulationConfigProperty {

  def apply(
    unvalidatedJson: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.Builder)
      .unvalidatedJson(unvalidatedJson.orNull)
      .build()
}
