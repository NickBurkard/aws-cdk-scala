package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DvbSdtSettingsProperty {

  def apply(
    serviceProviderName: Option[String] = None,
    serviceName: Option[String] = None,
    outputSdt: Option[String] = None,
    repInterval: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.DvbSdtSettingsProperty.Builder)
      .serviceProviderName(serviceProviderName.orNull)
      .serviceName(serviceName.orNull)
      .outputSdt(outputSdt.orNull)
      .repInterval(repInterval.orNull)
      .build()
}
