package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSkillProps {

  def apply(
    skillPackage: software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty,
    vendorId: String,
    authenticationConfiguration: software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty
  ): software.amazon.awscdk.alexa.ask.CfnSkillProps =
    (new software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder)
      .skillPackage(skillPackage)
      .vendorId(vendorId)
      .authenticationConfiguration(authenticationConfiguration)
      .build()
}
