package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegistryCredentialProperty {

  def apply(
    credentialProvider: Option[String] = None,
    credential: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder)
      .credentialProvider(credentialProvider.orNull)
      .credential(credential.orNull)
      .build()
}
