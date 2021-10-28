package io.burkard.cdk.services.finspace

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEnvironmentProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    federationMode: Option[String] = None,
    federationParameters: Option[software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.finspace.CfnEnvironmentProps =
    (new software.amazon.awscdk.services.finspace.CfnEnvironmentProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .federationMode(federationMode.orNull)
      .federationParameters(federationParameters.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
