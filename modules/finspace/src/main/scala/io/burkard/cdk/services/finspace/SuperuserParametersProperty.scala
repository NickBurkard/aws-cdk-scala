package io.burkard.cdk.services.finspace

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SuperuserParametersProperty {

  def apply(
    emailAddress: Option[String] = None,
    lastName: Option[String] = None,
    firstName: Option[String] = None
  ): software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty =
    (new software.amazon.awscdk.services.finspace.CfnEnvironment.SuperuserParametersProperty.Builder)
      .emailAddress(emailAddress.orNull)
      .lastName(lastName.orNull)
      .firstName(firstName.orNull)
      .build()
}
