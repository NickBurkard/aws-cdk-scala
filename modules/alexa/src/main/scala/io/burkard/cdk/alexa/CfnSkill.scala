package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSkill {

  def apply(
    internalResourceId: String,
    skillPackage: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty,
    vendorId: String,
    authenticationConfiguration: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.alexa.ask.CfnSkill =
    software.amazon.awscdk.alexa.ask.CfnSkill.Builder
      .create(stackCtx, internalResourceId)
      .skillPackage(skillPackage)
      .vendorId(vendorId)
      .authenticationConfiguration(authenticationConfiguration)
      .build()
}
