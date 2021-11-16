package io.burkard.cdk.services.finspace

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEnvironment {

  def apply(
    internalResourceId: String,
    name: String,
    description: Option[String] = None,
    federationMode: Option[String] = None,
    federationParameters: Option[software.amazon.awscdk.services.finspace.CfnEnvironment.FederationParametersProperty] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.finspace.CfnEnvironment =
    software.amazon.awscdk.services.finspace.CfnEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .description(description.orNull)
      .federationMode(federationMode.orNull)
      .federationParameters(federationParameters.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
