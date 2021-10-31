package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSkill {

  def apply(
    internalResourceId: String,
    skillPackage: Option[software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty] = None,
    vendorId: Option[String] = None,
    authenticationConfiguration: Option[software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.alexa.ask.CfnSkill =
    software.amazon.awscdk.alexa.ask.CfnSkill.Builder
      .create(stackCtx, internalResourceId)
      .skillPackage(skillPackage.orNull)
      .vendorId(vendorId.orNull)
      .authenticationConfiguration(authenticationConfiguration.orNull)
      .build()
}
