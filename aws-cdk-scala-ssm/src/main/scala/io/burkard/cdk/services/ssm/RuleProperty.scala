package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleProperty {

  def apply(
    approveUntilDate: Option[String] = None,
    patchFilterGroup: Option[software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty] = None,
    complianceLevel: Option[String] = None,
    enableNonSecurity: Option[Boolean] = None,
    approveAfterDays: Option[Number] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty.Builder)
      .approveUntilDate(approveUntilDate.orNull)
      .patchFilterGroup(patchFilterGroup.orNull)
      .complianceLevel(complianceLevel.orNull)
      .enableNonSecurity(enableNonSecurity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .approveAfterDays(approveAfterDays.orNull)
      .build()
}
