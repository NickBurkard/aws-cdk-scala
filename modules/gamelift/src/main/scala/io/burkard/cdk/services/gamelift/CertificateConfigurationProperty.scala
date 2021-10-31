package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificateConfigurationProperty {

  def apply(
    certificateType: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty.Builder)
      .certificateType(certificateType.orNull)
      .build()
}
