package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UpdateDeviceCertificateParamsProperty {

  def apply(
    action: String
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.Builder)
      .action(action)
      .build()
}
