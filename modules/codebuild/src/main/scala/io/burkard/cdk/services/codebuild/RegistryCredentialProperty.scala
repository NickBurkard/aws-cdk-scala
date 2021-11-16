package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegistryCredentialProperty {

  def apply(
    credentialProvider: String,
    credential: String
  ): software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder)
      .credentialProvider(credentialProvider)
      .credential(credential)
      .build()
}
