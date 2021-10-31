package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DvbTdtSettingsProperty {

  def apply(
    repInterval: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.DvbTdtSettingsProperty.Builder)
      .repInterval(repInterval.orNull)
      .build()
}
