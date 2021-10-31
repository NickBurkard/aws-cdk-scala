package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DemodulationConfigProperty {

  def apply(
    unvalidatedJson: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.Builder)
      .unvalidatedJson(unvalidatedJson.orNull)
      .build()
}
