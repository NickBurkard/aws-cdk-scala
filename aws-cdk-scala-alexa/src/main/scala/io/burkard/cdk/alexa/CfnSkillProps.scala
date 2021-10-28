package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSkillProps {

  def apply(
    skillPackage: Option[software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty] = None,
    vendorId: Option[String] = None,
    authenticationConfiguration: Option[software.amazon.awscdk.alexa.ask.CfnSkill.AuthenticationConfigurationProperty] = None
  ): software.amazon.awscdk.alexa.ask.CfnSkillProps =
    (new software.amazon.awscdk.alexa.ask.CfnSkillProps.Builder)
      .skillPackage(skillPackage.orNull)
      .vendorId(vendorId.orNull)
      .authenticationConfiguration(authenticationConfiguration.orNull)
      .build()
}
