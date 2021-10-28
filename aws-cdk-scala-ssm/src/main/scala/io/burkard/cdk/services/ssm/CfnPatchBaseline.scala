package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPatchBaseline {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    approvedPatchesEnableNonSecurity: Option[Boolean] = None,
    approvalRules: Option[software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty] = None,
    patchGroups: Option[List[String]] = None,
    rejectedPatches: Option[List[String]] = None,
    sources: Option[List[_]] = None,
    description: Option[String] = None,
    globalFilters: Option[software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    approvedPatchesComplianceLevel: Option[String] = None,
    approvedPatches: Option[List[String]] = None,
    rejectedPatchesAction: Option[String] = None,
    operatingSystem: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnPatchBaseline =
    software.amazon.awscdk.services.ssm.CfnPatchBaseline.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .approvalRules(approvalRules.orNull)
      .patchGroups(patchGroups.map(_.asJava).orNull)
      .rejectedPatches(rejectedPatches.map(_.asJava).orNull)
      .sources(sources.map(_.asJava).orNull)
      .description(description.orNull)
      .globalFilters(globalFilters.orNull)
      .tags(tags.map(_.asJava).orNull)
      .approvedPatchesComplianceLevel(approvedPatchesComplianceLevel.orNull)
      .approvedPatches(approvedPatches.map(_.asJava).orNull)
      .rejectedPatchesAction(rejectedPatchesAction.orNull)
      .operatingSystem(operatingSystem.orNull)
      .build()
}
